package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedPreserveWhitespaceTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

}