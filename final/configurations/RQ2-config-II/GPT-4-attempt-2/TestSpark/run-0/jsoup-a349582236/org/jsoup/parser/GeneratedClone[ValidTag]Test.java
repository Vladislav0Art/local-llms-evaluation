package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedClone[ValidTag]

Test {

    @Test
    public void clone[ ValidTag]Test() {
        Tag tag = Tag.valueOf("p");
        Tag clonedTag = tag.clone();
        Assert.assertNotSame(tag, clonedTag);
        Assert.assertEquals(tag, clonedTag);
    }

}