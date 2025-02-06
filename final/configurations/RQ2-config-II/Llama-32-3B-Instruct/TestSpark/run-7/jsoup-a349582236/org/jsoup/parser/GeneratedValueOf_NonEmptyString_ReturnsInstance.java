package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_NonEmptyString_ReturnsInstance {

    @Test
    public void valueOf_NonEmptyString_ReturnsInstance() {
        String tagName = "test";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        AssertTrue.assertTrue(tag instanceof Tag);
    }

}