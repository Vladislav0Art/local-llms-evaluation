package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = tag1.clone();
        Assert.assertEquals(tag1, tag2);
    }

}