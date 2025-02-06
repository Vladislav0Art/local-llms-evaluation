package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormSubmittable_ValidTagIsFormSubmittable_ReturnsTrue {

    @Test
    public void isFormSubmittable_ValidTagIsFormSubmittable_ReturnsTrue() {
        String tagName = "input[type=submit]";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isFormSubmittable());
    }

}