package org.jsoup.parser;

public class GeneratedIsFormListed_AcceptableTagsReturnTrue {

    @Test
    public void isFormListed_AcceptableTagsReturnTrue() {
        assertTrue(Tag.isFormListed("form"));
        assertFalse(Tag.isFormListed("div"));
    }

}