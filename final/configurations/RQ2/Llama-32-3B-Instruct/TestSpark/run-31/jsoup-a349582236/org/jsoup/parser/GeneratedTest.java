package org.jsoup.parser;

public class GeneratedTest {

    private String name;
    private String normalName;

    public Tag(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNormalName(String name) {
        this.normalName = name;
    }

    public String getNormalName() {
        switch (name.toLowerCase()) {
            case "form":
                return "form";
            case "div":
                return "div";
            case "img":
                return "img";
            case "a":
                return "a";
            default:
                return "";
        }
    }
}

public class TestTag {

}