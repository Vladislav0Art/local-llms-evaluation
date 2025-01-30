package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        Tag preTag = Tag.valueOf("pre");
        Assert.assertTrue(preTag.preserveWhitespace());

        Tag divTag = Tag.valueOf("div");
        Assert.assertFalse(divTag.preserveWhitespace());
    }

}