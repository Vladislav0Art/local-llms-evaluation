package org.jsoup.parser;

public class GeneratedNormalName_LowercaseName_ReturnsNormalizedName {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class TagTest {

    @Test
    public void normalName_LowercaseName_ReturnsNormalizedName() {
        Tag tag = new Tag("p");
        String name = tag.getName();
        assertEquals("p", name);
    }

}