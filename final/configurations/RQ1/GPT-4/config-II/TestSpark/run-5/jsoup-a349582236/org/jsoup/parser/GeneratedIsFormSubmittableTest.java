package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isFormSubmittable());
        tag = new Tag("button");
        Assert.assertTrue(tag.isFormSubmittable());
    }

}