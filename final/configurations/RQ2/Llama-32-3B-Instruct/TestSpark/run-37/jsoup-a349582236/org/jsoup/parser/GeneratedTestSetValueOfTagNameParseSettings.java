package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTestSetValueOfTagNameParseSettings {

    @Test
    public void testSetValueOfTagNameParseSettings() {
        Tag tag = new Tag();
        ParseSettings settings = new ParseSettings();
        assertEquals(tag, Tag.valueOf("tag", settings));
    }

}