package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Assert.assertTrue(tag1.equals(tag2));
    }

}