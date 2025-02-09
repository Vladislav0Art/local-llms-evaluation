package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedNormalName_EmptyString_ReturnsEmptyString {

    @Test
    public void normalName_EmptyString_ReturnsEmptyString() {
        String tagName = "";
        String expectedNormalName = "";
        Tag tag = new Tag(tagName);
        assertEquals(expectedNormalName, tag.normalName());
    }

}