package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_NamesWithMultipleChars {

    @Test
    public void valueOf_NamesWithMultipleChars() {
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        Assert.assertEquals("img", tag.getName());
    }

}