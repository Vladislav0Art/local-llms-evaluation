package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedIsInline_ReturnsFalseForNonInlineTags {

    @Test
    public void isInline_ReturnsFalseForNonInlineTags() {
        Tag tag = new Tag();
        tag.setName("p");
        assertFalse(tag.isInline());
    }

}