package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_NonEmptyString_ReturnsFalse {

    @Test
    public void isEmpty_NonEmptyString_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("Test");
        Validate.assertFalse(tag.isEmpty());
    }

}