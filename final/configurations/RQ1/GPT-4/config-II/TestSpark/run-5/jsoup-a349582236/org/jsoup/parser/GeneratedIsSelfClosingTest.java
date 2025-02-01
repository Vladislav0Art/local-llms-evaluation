package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSelfClosingTest {

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("meta");
        Assert.assertTrue(tag.isSelfClosing());
        tag = new Tag("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

}