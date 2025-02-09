package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("div");
        Tag cloneTag = tag.clone();
        Assert.assertNotSame(tag, cloneTag);
        Assert.assertEquals(tag, cloneTag);
    }

}