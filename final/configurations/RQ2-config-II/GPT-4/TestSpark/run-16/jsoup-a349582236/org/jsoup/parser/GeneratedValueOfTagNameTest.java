package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedValueOfTagNameTest {

    @Test
    public void valueOfTagNameTest() {
        Tag tag = Tag.valueOf("P");
        Assert.assertEquals("p", tag.getName());
    }

}