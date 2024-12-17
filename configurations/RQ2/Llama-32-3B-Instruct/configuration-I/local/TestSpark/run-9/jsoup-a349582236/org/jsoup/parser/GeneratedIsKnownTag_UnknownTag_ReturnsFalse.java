package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsKnownTag_UnknownTag_ReturnsFalse {

    @Test
    public void isKnownTag_UnknownTag_ReturnsFalse() {
        String tagName = "xyz";
        ParseSettings settings = null;
        assertFalse(Tag.isKnownTag(tagName));
    }

}