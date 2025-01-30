package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag pTag = Tag.valueOf("p");
        Assert.assertFalse(pTag.isInline());

        Tag aTag = Tag.valueOf("a");
        Assert.assertTrue(aTag.isInline());
    }

}