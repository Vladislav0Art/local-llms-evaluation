package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_NonEmptyTagName_ReturnsTagName {

    @Test
    public void getName_NonEmptyTagName_ReturnsTagName() {
        String tagName = "div";
        String actualName = Tag.getName(tagName);
        assertNotNull(actualName);
        assertEquals(tagName, actualName);
    }

}