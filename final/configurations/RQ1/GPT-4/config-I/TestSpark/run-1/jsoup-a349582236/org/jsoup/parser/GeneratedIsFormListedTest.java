package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag inputTag = Tag.valueOf("input");
        Assert.assertTrue(inputTag.isFormListed());

        Tag divTag = Tag.valueOf("div");
        Assert.assertFalse(divTag.isFormListed());
    }

}