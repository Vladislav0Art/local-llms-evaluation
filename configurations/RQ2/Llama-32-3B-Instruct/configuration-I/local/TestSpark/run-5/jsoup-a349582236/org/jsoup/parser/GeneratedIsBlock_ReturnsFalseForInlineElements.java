package org.jsoup.parser;

public class GeneratedIsBlock_ReturnsFalseForInlineElements {

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
    public void isBlock_ReturnsFalseForInlineElements() {
        Tag tag = new Tag("span");
        boolean result = tag.isBlock();
        assertFalse(result);
    }

}