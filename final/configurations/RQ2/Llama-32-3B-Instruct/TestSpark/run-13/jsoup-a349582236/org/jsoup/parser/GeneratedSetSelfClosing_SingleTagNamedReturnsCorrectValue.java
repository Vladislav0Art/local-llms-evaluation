package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedSetSelfClosing_SingleTagNamedReturnsCorrectValue {

    @Test
    public void setSelfClosing_SingleTagNamedReturnsCorrectValue() {
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.setSelfClosing());
        assertFalse(tag.isSelfClosing());
    }

}