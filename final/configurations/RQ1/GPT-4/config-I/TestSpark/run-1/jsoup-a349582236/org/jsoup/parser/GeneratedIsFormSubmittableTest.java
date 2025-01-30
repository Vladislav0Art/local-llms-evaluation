package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        Tag inputTag = Tag.valueOf("input");
        Assert.assertTrue(inputTag.isFormSubmittable());

        Tag divTag = Tag.valueOf("div");
        Assert.assertFalse(divTag.isFormSubmittable());
    }

}