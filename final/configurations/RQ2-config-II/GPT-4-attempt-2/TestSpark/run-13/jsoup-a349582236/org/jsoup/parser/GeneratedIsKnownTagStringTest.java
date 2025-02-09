package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsKnownTagStringTest {

    @Test
    public void isKnownTagStringTest() {
        Assert.assertTrue(Tag.isKnownTag("div"));
    }

}