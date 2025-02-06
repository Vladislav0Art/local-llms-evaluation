package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormListed_ValidTagNameNotFormListed ReturnsFalse {

    @Test
    public void isFormListed_ValidTagNameNotFormListed

    ReturnsFalse() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isFormListed());
    }

}