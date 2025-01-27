package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTestIsFormSubmittable_EmptyTagDoesNotReturnTrue {

    @Test
    public void testIsFormSubmittable_EmptyTagDoesNotReturnTrue() {
        assertFalse(Tag.isFormSubmittable(""));
    }

}