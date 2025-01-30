package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class GeneratedIsBlockAndFormatAsBlockTest {

    @Test
    public void isBlockAndFormatAsBlockTest() throws Exception {
        Tag tag = Tag.valueOf("pre", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isBlock());
        Assert.assertTrue(tag.formatAsBlock());
    }

}