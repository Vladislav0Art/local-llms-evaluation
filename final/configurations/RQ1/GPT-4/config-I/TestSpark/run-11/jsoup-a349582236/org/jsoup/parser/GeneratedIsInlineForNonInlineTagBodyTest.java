package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsInlineForNonInlineTagBodyTest {

    @Test
    public void isInlineForNonInlineTagBodyTest() {
        Assert.assertFalse(Tag.valueOf("body").isInline());
    }

}