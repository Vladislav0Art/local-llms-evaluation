package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_NonEmptyString_ReturnsNonEmptyString {

    @Test
    public void normalName_NonEmptyString_ReturnsNonEmptyString() {
        Tag tag = new Tag();
        tag.setName("Test");
        Validate.equals("test", tag.normalName());
    }

}