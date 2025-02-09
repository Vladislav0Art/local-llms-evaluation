package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals("div", tag.getName());
    }

}