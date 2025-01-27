package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormSubmittable_EmptyTagDoesNotReturnTrue {

    @Test
    public void isFormSubmittable_EmptyTagDoesNotReturnTrue() {
        assertFalse(Tag.isFormSubmittable(""));
    }

}