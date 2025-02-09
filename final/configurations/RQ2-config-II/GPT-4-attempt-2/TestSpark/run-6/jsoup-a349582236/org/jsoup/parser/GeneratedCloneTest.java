package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("div");
        Tag clonedTag = (Tag) tag.clone();
        Assert.assertEquals(tag, clonedTag);
    }

}