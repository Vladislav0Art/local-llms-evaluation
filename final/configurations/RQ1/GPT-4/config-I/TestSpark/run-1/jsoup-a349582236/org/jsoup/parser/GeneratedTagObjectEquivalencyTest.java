package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTagObjectEquivalencyTest {

    @Test
    public void tagObjectEquivalencyTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");

        Assert.assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("p");
        Assert.assertFalse(tag1.equals(tag3));
    }

}