package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsKnownTagInstanceTest {

    @Test
    public void isKnownTagInstanceTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag.isKnownTag());
    }

}