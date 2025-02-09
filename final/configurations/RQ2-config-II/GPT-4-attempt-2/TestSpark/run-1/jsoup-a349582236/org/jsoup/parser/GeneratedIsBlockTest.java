package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag sampleTag = Tag.valueOf("div");
        Assert.assertTrue(sampleTag.isBlock());
    }

}