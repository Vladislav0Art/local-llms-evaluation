package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isFormListed());
        tag = new Tag("button");
        Assert.assertTrue(tag.isFormListed());
    }

}