package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isBlock());
    }

}