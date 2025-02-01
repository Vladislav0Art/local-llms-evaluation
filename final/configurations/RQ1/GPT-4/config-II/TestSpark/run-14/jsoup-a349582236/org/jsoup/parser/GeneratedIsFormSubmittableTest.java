package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

}