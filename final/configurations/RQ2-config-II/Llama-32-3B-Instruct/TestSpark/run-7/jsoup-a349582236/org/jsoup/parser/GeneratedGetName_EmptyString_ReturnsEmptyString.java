package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyString_ReturnsEmptyString {

    @Test
    public void getName_EmptyString_ReturnsEmptyString() {
        Tag tag = new Tag();
        Validate.equals("", tag.getName());
    }

}