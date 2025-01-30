package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableForTagNotSubmittableWithFormButtonTest {

    @Test
    public void isFormSubmittableForTagNotSubmittableWithFormButtonTest() {
        Assert.assertFalse(Tag.valueOf("button").isFormSubmittable());
    }

}