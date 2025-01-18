package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagStringTest {

    @Test
    public void isKnownTagStringTest() {
        Assert.assertTrue(Tag.isKnownTag("div"));
    }

}