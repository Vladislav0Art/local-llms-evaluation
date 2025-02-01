package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.isBlock());
        tag = new Tag("span");
        Assert.assertFalse(tag.isBlock());
    }

}