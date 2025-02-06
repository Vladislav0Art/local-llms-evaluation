package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_ValidName_ReturnsTagInstance {

    @Test
    public void valueOf_ValidName_ReturnsTagInstance() {
        String name = "img";
        ParseSettings settings = new ParseSettings();
        Tag expectedTag = new Tag("img");
        assertTrue(Tag.valueOf(name, settings) == expectedTag);
    }

}