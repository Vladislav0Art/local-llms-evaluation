package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        Tag sampleTag = Tag.valueOf("input");
        Assert.assertTrue(sampleTag.isFormSubmittable());
    }

}