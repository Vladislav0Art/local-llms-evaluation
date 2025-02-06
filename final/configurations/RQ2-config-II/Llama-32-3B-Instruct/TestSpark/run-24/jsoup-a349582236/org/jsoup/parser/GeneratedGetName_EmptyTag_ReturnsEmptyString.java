package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyTag_ReturnsEmptyString {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        String name = Tag.valueOf("").getName();
        assertEquals("", name);
    }

}