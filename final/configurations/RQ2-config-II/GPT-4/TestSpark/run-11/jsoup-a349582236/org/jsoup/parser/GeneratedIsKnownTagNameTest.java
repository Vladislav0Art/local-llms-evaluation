package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsKnownTagNameTest {

    @Test
    public void isKnownTagNameTest() {
        Assert.assertTrue(Tag.isKnownTag("head"));
    }

}