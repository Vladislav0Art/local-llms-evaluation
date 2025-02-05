package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("button");
        Assert.assertTrue(tag.isFormSubmittable());
    }

}