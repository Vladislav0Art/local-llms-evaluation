package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormListed_ValidTagIsFormListed_ReturnsTrue {

    @Test
    public void isFormListed_ValidTagIsFormListed_ReturnsTrue() {
        String tagName = "form";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isFormListed());
    }

}