package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedGetName_EmptyName_ThrowsValidationException {

    @Test
    public void getName_EmptyName_ThrowsValidationException() {
        String tagName = "";
        Validate.validatethagetName(tagName);
        assertTrue(tagName.isEmpty());
    }

}