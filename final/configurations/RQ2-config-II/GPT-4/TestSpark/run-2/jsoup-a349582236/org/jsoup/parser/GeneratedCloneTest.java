package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        Tag clonedTag = tag.clone();
        Assert.assertTrue(tag.equals(clonedTag));
        Assert.assertNotSame(tag, clonedTag);
    }

}