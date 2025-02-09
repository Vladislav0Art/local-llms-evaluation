package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetName_NonEmptyTagName_ReturnsTagName {

    @Test
    public void testGetName_NonEmptyTagName_ReturnsTagName() {
        String tagName = "div";
        String actualName = Tag.getName(tagName);
        assertNotNull(actualName);
        assertEquals(tagName, actualName);
    }

}