package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyTags_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTags_ReturnsTrue() {
        assertFalse(Tag.isEmpty(""));
        assertTrue(Tag.isEmpty("<"));
    }

}