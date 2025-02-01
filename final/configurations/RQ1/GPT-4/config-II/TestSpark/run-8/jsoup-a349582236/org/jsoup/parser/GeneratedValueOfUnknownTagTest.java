package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfUnknownTagTest {

    @Test
    public void valueOfUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        Assert.assertEquals("unknown", tag.getName());
    }

}