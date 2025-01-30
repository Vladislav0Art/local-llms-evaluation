package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag divTag = Tag.valueOf("div");
        Assert.assertTrue(divTag.isBlock());

        Tag aTag = Tag.valueOf("a");
        Assert.assertFalse(aTag.isBlock());
    }

}