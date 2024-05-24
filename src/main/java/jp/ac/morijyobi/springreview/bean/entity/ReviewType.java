package jp.ac.morijyobi.springreview.bean.entity;

public class ReviewType {
    private int id;
    private String typeCode;
    private String typeName;

    public ReviewType(int id, String typeCode, String typeName) {
        this.id = id;
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
