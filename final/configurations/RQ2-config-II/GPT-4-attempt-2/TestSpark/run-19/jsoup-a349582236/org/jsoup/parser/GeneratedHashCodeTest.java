package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Assert.assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}