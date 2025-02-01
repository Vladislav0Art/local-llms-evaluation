package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockBlockTagTest {

    @Test
    public void isBlockBlockTagTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag.isBlock());
    }

}