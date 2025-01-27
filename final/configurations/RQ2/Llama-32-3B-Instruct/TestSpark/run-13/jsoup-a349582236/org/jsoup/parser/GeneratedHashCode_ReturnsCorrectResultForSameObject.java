package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedHashCode_ReturnsCorrectResultForSameObject {

    @Test
    public void hashCode_ReturnsCorrectResultForSameObject() {
        String tagName = "p";
        ParseSettings settings = new ParseSettings();
        Tag originalTag = Tag.valueOf(tagName, settings);
        assertEquals(originalTag.hashCode(), originalTag.hashCode());
    }

}