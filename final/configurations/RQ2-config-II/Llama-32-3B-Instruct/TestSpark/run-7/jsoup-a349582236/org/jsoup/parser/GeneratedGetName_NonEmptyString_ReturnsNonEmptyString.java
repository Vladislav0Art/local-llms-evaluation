package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_NonEmptyString_ReturnsNonEmptyString {

    @Test
    public void getName_NonEmptyString_ReturnsNonEmptyString() {
        Tag tag = new Tag();
        tag.setName("Test");
        Validate.equals("Test", tag.getName());
    }

}