package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        String tagName = "p";
        boolean knownTag = Tag.isKnownTag(tagName);
        Assert.assertTrue(knownTag);
    }

}