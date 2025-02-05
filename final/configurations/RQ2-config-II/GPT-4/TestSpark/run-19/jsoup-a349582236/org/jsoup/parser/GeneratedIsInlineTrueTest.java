package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsInlineTrueTest {

    @Test
    public void isInlineTrueTest() {
        Tag tag = Tag.valueOf("b");
        Assert.assertTrue(tag.isInline());
    }

}