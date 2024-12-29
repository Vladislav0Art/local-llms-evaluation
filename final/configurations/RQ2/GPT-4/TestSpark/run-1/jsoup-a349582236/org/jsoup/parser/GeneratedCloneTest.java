package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = tag1.clone();
        Assert.assertTrue(tag1 != tag2 && tag1.equals(tag2));
    }

}