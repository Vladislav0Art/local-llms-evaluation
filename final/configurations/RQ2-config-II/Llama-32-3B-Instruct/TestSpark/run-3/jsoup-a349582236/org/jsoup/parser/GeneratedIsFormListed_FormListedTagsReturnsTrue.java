package org.jsoup.parser;

public class GeneratedIsFormListed_FormListedTagsReturnsTrue {

    @Test
    public void isFormListed_FormListedTagsReturnsTrue() {
        Tag formListedTag = Tag.valueOf("<form><input type='text'></form>");
        assertTrue(formListedTag.isFormListed());
    }

}