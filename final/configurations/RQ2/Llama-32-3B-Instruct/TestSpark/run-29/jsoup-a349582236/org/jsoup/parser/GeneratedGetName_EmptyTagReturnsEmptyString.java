package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyTagReturnsEmptyString {

    @Test
    public void getName_EmptyTagReturnsEmptyString() {
        String name = new Tag().getName();
        assertEquals("", name);
    }

}