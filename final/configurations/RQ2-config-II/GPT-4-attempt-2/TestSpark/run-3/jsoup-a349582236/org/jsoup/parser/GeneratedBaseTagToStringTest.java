package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBaseTagToStringTest {

    @Test
    public void baseTagToStringTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertEquals("<span></span>", tag.toString());
    }

}