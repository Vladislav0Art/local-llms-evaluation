package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_FormListingTag_ReturnsTrue {

    @Test
    public void isFormListed_FormListingTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("form");
        Validate.isTrue(tag.isFormListed());
    }

}