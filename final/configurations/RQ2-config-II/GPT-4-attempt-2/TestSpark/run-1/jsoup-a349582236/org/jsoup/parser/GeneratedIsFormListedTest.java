package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag sampleTag = Tag.valueOf("option");
        Assert.assertTrue(sampleTag.isFormListed());
    }

}