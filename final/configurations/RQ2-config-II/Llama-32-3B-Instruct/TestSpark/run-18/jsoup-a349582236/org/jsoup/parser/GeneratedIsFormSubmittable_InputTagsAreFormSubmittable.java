package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormSubmittable_InputTagsAreFormSubmittable {

    @Test
    public void isFormSubmittable_InputTagsAreFormSubmittable() {
        assertTrue(Tag.isFormSubmittable("input"));
    }

}