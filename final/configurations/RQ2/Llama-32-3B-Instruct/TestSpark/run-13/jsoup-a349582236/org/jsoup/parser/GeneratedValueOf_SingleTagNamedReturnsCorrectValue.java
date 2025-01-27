package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedValueOf_SingleTagNamedReturnsCorrectValue {

    @Test
    public void valueOf_SingleTagNamedReturnsCorrectValue() {
        String tagName = "p";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertTrue(tag.getName().equals(tagName));
    }

}