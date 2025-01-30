package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        String name = "testName";
        Tag tag = Tag.valueOf(name);
        Assert.assertEquals(name, tag.getName());
    }

}