package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        int expectedHashCode = tag.getName().hashCode();
        Assert.assertEquals(expectedHashCode, tag.hashCode());
    }

}