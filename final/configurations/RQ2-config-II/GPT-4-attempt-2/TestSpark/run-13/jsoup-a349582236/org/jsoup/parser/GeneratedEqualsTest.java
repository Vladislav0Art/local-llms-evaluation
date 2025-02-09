package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        Assert.assertTrue(tag1.equals(tag2));
    }

}