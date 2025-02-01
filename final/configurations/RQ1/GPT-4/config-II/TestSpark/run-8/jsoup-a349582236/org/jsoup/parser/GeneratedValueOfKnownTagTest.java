package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfKnownTagTest {

    @Test
    public void valueOfKnownTagTest() {
        Tag tag = Tag.valueOf("html");
        Assert.assertEquals("html", tag.getName());
    }

}