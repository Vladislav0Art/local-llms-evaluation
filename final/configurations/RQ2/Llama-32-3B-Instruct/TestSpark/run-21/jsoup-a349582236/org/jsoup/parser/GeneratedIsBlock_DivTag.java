package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_DivTag {

    @Test
    public void isBlock_DivTag() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.isBlock());
    }

}