package org.jsoup.parser;

public class GeneratedGetName_EmptyTag_ReturnsEmptyString {

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
    public void getName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag("");
        String name = tag.getName();
        assertEquals("", name);
    }

}