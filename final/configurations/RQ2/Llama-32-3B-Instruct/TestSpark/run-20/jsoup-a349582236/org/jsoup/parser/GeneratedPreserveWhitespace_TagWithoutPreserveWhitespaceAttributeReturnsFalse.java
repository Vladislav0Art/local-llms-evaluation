package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedPreserveWhitespace_TagWithoutPreserveWhitespaceAttributeReturnsFalse {

    @Test
    public void preserveWhitespace_TagWithoutPreserveWhitespaceAttributeReturnsFalse() {
        assertFalse(Tag.preserveWhitespace("p"));
    }

}