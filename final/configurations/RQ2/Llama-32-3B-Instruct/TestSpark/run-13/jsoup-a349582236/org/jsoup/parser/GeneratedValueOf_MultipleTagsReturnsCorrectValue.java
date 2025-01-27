package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedValueOf_MultipleTagsReturnsCorrectValue {

    @Test
    public void valueOf_MultipleTagsReturnsCorrectValue() {
        String[] tagNames = {"span", "br"};
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(String.join(" ", tagNames), settings);
        assertNotNull(tag);
        assertTrue(tag.getName().equals(String.join(" ", tagNames)));
    }

}