package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_ExistingTag {

    @Test
    public void isKnownTag_ExistingTag() {
        String tagName = "script";
        Assert.assertTrue(Tag.isKnownTag(tagName));
    }

}