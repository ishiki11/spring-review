package jp.ac.morijyobi.springreview.controller;

import jp.ac.morijyobi.springreview.bean.form.ReviewForm;
import jp.ac.morijyobi.springreview.bean.entity.ReviewType;
import jp.ac.morijyobi.springreview.service.ReviewService;
import jp.ac.morijyobi.springreview.service.ReviewTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;
    private final ReviewTypeService reviewTypeService;

    public ReviewController(ReviewService reviewService, ReviewTypeService reviewTypeService) {
        this.reviewService = reviewService;
        this.reviewTypeService = reviewTypeService;
    }

    @GetMapping("/register")
    public String register(Model model) {

        ReviewForm form = new ReviewForm();
        form.setReviewTypeCode("MOVIE");
        model.addAttribute("reviewForm", form);

        List<ReviewType> reviewTypeList = reviewTypeService.getAllReviewTypes();

        model.addAttribute("reviewTypeList", reviewTypeList);

        return "review/register";
    }

    @PostMapping("/confirm")
    public String validationRegister(@Validated ReviewForm reviewForm,
                                    BindingResult bindingResult,
                                    Model model) {
        // プルダウンのデータをthymeleafに渡す
        List<ReviewType> reviewTypeList = reviewTypeService.getAllReviewTypes();
        model.addAttribute("reviewTypeList", reviewTypeList);
        if (bindingResult.hasErrors()) {
            return "review/register";
        }

        return "review/register-confirm";
    }

    @PostMapping(value = "/register", params = "back")
    public String registerBack(ReviewForm reviewForm,
                              BindingResult bindingResult,
                              Model model) {
        // プルダウンのデータをthymeleafに渡す
        List<ReviewType> reviewTypeList = reviewTypeService.getAllReviewTypes();
        model.addAttribute("reviewTypeList", reviewTypeList);
        return "review/register";
    }

    @PostMapping(value = "/register", params = "correct")
    public String registerExe(@Validated ReviewForm reviewForm,
                              BindingResult bindingResult,
                              Model model) {
        // プルダウンのデータをthymeleafに渡す
        List<ReviewType> reviewTypeList = reviewTypeService.getAllReviewTypes();
        model.addAttribute("reviewTypeList", reviewTypeList);
        if (bindingResult.hasErrors()) {
            return "review/register";
        }
        reviewService.registerReview(reviewForm);
        return "redirect:review/list";
    }
}
