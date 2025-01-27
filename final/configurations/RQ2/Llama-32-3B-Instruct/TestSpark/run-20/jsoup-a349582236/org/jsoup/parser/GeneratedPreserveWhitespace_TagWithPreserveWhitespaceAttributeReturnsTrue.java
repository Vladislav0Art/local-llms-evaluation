package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedPreserveWhitespace_TagWithPreserveWhitespaceAttributeReturnsTrue {

    @Test
    public void preserveWhitespace_TagWithPreserveWhitespaceAttributeReturnsTrue() {
        assertTrue(Tag.preserveWhitespace("img"));
    }

}