package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_EmptyTagName_ReturnsNull {

    @Test
    public void valueOf_EmptyTagName_ReturnsNull() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("", settings);
        assertNull(tag);
    }

}