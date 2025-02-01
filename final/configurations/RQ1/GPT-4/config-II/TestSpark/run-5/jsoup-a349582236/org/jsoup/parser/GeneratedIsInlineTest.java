package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("span");
        Assert.assertTrue(tag.isInline());
        tag = new Tag("div");
        Assert.assertFalse(tag.isInline());
    }

}