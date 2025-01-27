package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedFormatAsBlock_SingleTagNamedReturnsTrue {

    @Test
    public void formatAsBlock_SingleTagNamedReturnsTrue() {
        String tagName = "p";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.formatAsBlock());
    }

}