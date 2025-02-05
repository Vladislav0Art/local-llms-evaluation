package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals(tag.hashCode(), Tag.valueOf("div").hashCode());
    }

}