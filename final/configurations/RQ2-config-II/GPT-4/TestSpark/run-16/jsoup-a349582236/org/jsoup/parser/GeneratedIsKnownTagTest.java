package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertTrue(tag.isKnownTag());
    }

}