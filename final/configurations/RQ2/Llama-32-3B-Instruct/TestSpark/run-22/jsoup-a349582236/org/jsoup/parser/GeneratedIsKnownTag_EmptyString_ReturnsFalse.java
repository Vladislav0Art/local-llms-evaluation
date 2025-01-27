package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_EmptyString_ReturnsFalse {

    @Test
    public void isKnownTag_EmptyString_ReturnsFalse() {
        Tag tag = Tag.isKnownTag("");
        assertFalse(tag);
    }

}