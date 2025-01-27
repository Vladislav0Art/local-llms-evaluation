package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_DifferentTagInstancesReturnFalse {

    @Test
    public void equals_DifferentTagInstancesReturnFalse() {
        String tagName1 = "div";
        String tagName2 = "span";
        Tag tag1 = Tag.valueOf(tagName1);
        Tag tag2 = Tag.valueOf(tagName2);
        assertFalse(tag1.equals(tag2));
    }

}