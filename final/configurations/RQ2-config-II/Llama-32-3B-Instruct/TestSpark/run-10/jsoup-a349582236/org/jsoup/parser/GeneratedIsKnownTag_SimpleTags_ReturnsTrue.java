package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_SimpleTags_ReturnsTrue {

    @Test
    public void isKnownTag_SimpleTags_ReturnsTrue() {
        assertTrue(Tag.isKnownTag("img"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

}