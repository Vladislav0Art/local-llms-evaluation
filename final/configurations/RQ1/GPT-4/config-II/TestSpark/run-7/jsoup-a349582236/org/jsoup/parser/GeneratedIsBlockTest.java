package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedIsBlockTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.isBlock());
    }

}