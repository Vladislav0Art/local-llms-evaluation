package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("p");
        Tag cloneTag = tag.clone();
        Assert.assertNotNull(cloneTag);
        Assert.assertEquals(tag, cloneTag);
    }

}