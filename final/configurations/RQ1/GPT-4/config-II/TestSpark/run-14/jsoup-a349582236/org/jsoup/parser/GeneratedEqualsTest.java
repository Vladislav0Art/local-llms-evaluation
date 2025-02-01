package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag = new Tag("div");
        Tag anotherTag = new Tag("div");
        Assert.assertTrue(tag.equals(anotherTag));
    }

}