package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsKnownTag_KnownTag_ReturnsTrue {

    @Test
    public void isKnownTag_KnownTag_ReturnsTrue() {
        String tagName = "p";
        ParseSettings settings = null;
        assertTrue(Tag.isKnownTag(tagName));
    }

}