package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedEqualsTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void equalsTest() {
        Tag tag1 = new Tag("div");
        Tag tag2 = new Tag("div");
        Assert.assertTrue(tag1.equals(tag2));
    }

}