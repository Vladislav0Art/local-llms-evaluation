package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockInlineTagTest {

    @Test
    public void isBlockInlineTagTest() {
        Tag tag = Tag.valueOf("a");
        Assert.assertFalse(tag.isBlock());
    }

}