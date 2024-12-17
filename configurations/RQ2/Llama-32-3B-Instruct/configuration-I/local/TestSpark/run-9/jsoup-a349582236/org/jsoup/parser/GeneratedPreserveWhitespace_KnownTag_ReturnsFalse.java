package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveWhitespace_KnownTag_ReturnsFalse {

    @Test
    public void preserveWhitespace_KnownTag_ReturnsFalse() {
        String tagName = "p";
        ParseSettings settings = null;
        assertFalse(Tag.valueOf(tagName, settings).preserveWhitespace());
    }

}