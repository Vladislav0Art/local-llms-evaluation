package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_FormTagsAreFalseByDefault {

    @Test
    public void isFormListed_FormTagsAreFalseByDefault() {
        String tagName = "input";
        assertFalse(Tag.valueOf(tagName).isFormListed());
    }

}