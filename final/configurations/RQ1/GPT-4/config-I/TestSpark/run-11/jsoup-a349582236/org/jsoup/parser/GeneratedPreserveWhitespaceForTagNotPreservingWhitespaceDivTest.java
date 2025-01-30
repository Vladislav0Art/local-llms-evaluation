package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveWhitespaceForTagNotPreservingWhitespaceDivTest {

    @Test
    public void preserveWhitespaceForTagNotPreservingWhitespaceDivTest() {
        Assert.assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

}