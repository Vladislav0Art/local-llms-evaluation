package org.jsoup.parser;

public class GeneratedGetNormalName_ATag_ReturnsATag {

    private String name;
    private String normalName;

    public Tag(String name) {
        this.name = name;
        this.normalName = getNormalName(name);
    }

    public String getName() {
        return name;
    }

    public String getNormalName() {
        return normalName;
    }

    private String getNormalName(String name) {
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

    public void setNormalName(String name) {
        this.normalName = name;
    }
}

public class TestTag {

    @Test
    public void getNormalName_ATag_ReturnsATag() {
        Tag tag = new Tag("a");
        assertEquals("a", tag.getNormalName());
    }

}