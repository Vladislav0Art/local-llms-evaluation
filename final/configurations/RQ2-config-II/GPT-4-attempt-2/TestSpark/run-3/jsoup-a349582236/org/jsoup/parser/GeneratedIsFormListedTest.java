package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("select");
        Assert.assertTrue(tag.isFormListed());
    }

}