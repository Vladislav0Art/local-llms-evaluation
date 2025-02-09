package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag1 = Tag.valueOf("div");
        Assert.assertEquals("div", tag1.toString());
    }

}