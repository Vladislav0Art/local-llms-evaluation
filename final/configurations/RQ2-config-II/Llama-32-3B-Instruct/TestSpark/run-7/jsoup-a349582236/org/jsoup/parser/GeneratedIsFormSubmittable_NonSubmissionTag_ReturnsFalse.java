package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_NonSubmissionTag_ReturnsFalse {

    @Test
    public void isFormSubmittable_NonSubmissionTag_ReturnsFalse() {
        Tag tag = new Tag();
        Validate.assertFalse(tag.isFormSubmittable());
    }

}