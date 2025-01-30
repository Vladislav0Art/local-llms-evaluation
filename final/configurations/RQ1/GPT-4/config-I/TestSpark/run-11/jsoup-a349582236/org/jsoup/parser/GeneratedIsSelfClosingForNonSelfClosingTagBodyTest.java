package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSelfClosingForNonSelfClosingTagBodyTest {

    @Test
    public void isSelfClosingForNonSelfClosingTagBodyTest() {
        Assert.assertFalse(Tag.valueOf("body").isSelfClosing());
    }

}