package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedIsInlineTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("span");
        Assert.assertTrue(tag.isInline());
    }

}