package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName_EmptyName_ReturnsEmptyString {

    @Test
    public void normalName_EmptyName_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.normalName());
    }

}