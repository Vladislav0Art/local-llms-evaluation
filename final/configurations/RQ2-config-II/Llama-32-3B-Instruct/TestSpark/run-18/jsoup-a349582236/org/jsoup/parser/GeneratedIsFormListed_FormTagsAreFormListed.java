package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormListed_FormTagsAreFormListed {

    @Test
    public void isFormListed_FormTagsAreFormListed() {
        assertTrue(Tag.isFormListed("form"));
    }

}