package org.jsoup.parser;

public class GeneratedIsFormListed_FormAssociatedTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isFormListed_FormAssociatedTag_ReturnsTrue() {
        tag = new Tag("input");
        assertTrue(tag.isFormListed());
    }

}