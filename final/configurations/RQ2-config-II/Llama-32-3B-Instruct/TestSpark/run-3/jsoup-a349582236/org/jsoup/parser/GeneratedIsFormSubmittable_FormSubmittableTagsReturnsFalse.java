package org.jsoup.parser;

public class GeneratedIsFormSubmittable_FormSubmittableTagsReturnsFalse {

    @Test
    public void isFormSubmittable_FormSubmittableTagsReturnsFalse() {
        Tag formSubmittableTag = Tag.valueOf("<form id='test-form'><button>Submit</button></form>");
        assertFalse(formSubmittableTag.isFormSubmittable());
    }

}