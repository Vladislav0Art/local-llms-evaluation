package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_FormSubmissionTag_ReturnsTrue {

    @Test
    public void isFormSubmittable_FormSubmissionTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("input");
        Validate.isTrue(tag.isFormSubmittable());
    }

}