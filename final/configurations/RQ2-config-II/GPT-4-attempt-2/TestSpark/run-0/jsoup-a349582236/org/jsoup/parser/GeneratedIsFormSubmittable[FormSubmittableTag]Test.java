package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsFormSubmittable[FormSubmittableTag]

Test {

    @Test
    public void isFormSubmittable[ FormSubmittableTag]Test() {
        Tag tag = Tag.valueOf("input");
        Assert.assertTrue(tag.isFormSubmittable());
    }

}