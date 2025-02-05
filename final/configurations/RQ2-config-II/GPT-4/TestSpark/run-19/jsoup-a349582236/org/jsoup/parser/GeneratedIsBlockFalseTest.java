package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsBlockFalseTest {

    @Test
    public void isBlockFalseTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertFalse(tag.isBlock());
    }

}