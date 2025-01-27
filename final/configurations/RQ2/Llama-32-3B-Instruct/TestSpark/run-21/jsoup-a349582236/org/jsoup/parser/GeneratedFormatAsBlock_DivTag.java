package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_DivTag {

    @Test
    public void formatAsBlock_DivTag() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.formatAsBlock());
    }

}