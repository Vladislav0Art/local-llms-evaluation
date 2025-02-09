package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag sampleTag = Tag.valueOf("a");
        Assert.assertEquals("a", sampleTag.getName());
    }

}