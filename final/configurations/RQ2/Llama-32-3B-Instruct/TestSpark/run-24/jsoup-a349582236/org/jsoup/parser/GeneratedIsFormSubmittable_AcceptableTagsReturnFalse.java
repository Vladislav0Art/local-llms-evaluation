package org.jsoup.parser;

public class GeneratedIsFormSubmittable_AcceptableTagsReturnFalse {

    @Test
    public void isFormSubmittable_AcceptableTagsReturnFalse() {
        assertFalse(Tag.isFormSubmittable("img"));
        assertFalse(Tag.isFormSubmittable("<input type='image'>"));
        assertTrue(Tag.isFormSubmittable("form"));
    }

}