package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals(tag.toString(), "<div></div>");
    }

}