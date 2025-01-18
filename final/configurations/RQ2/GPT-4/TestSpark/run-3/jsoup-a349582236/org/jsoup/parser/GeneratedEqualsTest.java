package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("span");
        Tag tag2 = Tag.valueOf("span");
        Assert.assertTrue(tag1.equals(tag2));
    }

}