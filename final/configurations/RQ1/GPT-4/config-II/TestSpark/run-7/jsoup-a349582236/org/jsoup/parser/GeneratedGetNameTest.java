package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedGetNameTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void getNameTest() {
        Tag tag = new Tag("div");
        Assert.assertEquals("div", tag.getName());
    }

}