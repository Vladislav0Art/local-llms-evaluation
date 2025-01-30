package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableForTagSubmittableWithFormInputTest {

    @Test
    public void isFormSubmittableForTagSubmittableWithFormInputTest() {
        Assert.assertTrue(Tag.valueOf("input").isFormSubmittable());
    }

}