package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("div");
        Assert.assertTrue(tag.formatAsBlock());
        tag = new Tag("span");
        Assert.assertFalse(tag.formatAsBlock());
    }

}