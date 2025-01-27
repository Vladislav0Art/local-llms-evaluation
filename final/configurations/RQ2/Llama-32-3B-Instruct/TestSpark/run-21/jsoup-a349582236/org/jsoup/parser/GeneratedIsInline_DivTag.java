package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_DivTag {

    @Test
    public void isInline_DivTag() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isInline());
    }

}