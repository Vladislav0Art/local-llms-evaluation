package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockForInlineTagSpanTest {

    @Test
    public void isBlockForInlineTagSpanTest() {
        Assert.assertFalse(Tag.valueOf("span").isBlock());
    }

}