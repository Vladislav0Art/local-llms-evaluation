package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedPreserveWhitespace_AttributeWithSpace_ReturnsFalse {

    @Test
    public void preserveWhitespace_AttributeWithSpace_ReturnsFalse() {
        String tagName = "input";
        Tag tag = new Tag(tagName);
        assertFalse(tag.preserveWhitespace());
    }

}