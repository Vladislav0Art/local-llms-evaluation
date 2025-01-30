package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSelfClosingForSelfClosingTagMetaTest {

    @Test
    public void isSelfClosingForSelfClosingTagMetaTest() {
        Assert.assertTrue(Tag.valueOf("meta").isSelfClosing());
    }

}