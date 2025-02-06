package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_NonFormListingTag_ReturnsFalse {

    @Test
    public void isFormListed_NonFormListingTag_ReturnsFalse() {
        Tag tag = new Tag();
        Validate.assertFalse(tag.isFormListed());
    }

}