package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveWhitespaceForTagPreservingWhitespacePreTest {

    @Test
    public void preserveWhitespaceForTagPreservingWhitespacePreTest() {
        Assert.assertTrue(Tag.valueOf("pre").preserveWhitespace());
    }

}