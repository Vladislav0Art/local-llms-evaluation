package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagInstanceTest {

    @Test
    public void isKnownTagInstanceTest() {
        Tag sampleTag = Tag.valueOf("div");
        Assert.assertTrue(sampleTag.isKnownTag());
    }

}