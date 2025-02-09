package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagInstanceTest {

    @Test
    public void isKnownTagInstanceTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isKnownTag());
    }

}