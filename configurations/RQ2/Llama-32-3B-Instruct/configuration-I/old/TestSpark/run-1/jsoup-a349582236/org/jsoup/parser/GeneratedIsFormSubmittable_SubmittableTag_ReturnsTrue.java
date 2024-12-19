package org.jsoup.parser;

public class GeneratedIsFormSubmittable_SubmittableTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isFormSubmittable_SubmittableTag_ReturnsTrue() {
        tag = new Tag("input");
        assertTrue(tag.isFormSubmittable());
    }

}