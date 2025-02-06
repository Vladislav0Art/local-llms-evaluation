package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_EmptyString_ReturnsEmptyString {

    @Test
    public void normalName_EmptyString_ReturnsEmptyString() {
        Tag tag = new Tag();
        Validate.equals("", tag.normalName());
    }

}