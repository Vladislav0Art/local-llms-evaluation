package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStaticIsKnownTagTest {

    @Test
    public void staticIsKnownTagTest() {
        Assert.assertTrue(Tag.isKnownTag("div"));
    }

}