package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormSubmittable_NotSelfClosingTag {

    @Test
    public void isFormSubmittable_NotSelfClosingTag() {
        Tag tag = new Tag("<form>");
        Assert.assertFalse(tag.isFormSubmittable());
    }

}