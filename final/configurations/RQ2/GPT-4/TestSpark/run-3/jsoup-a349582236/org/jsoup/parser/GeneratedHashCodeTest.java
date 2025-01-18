package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("span");
        int expectedHashCode = tag.toString().hashCode();
        Assert.assertEquals(expectedHashCode, tag.hashCode());
    }

}