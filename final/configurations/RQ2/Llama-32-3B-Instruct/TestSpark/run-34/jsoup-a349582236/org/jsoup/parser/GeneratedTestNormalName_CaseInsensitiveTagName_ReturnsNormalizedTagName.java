package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNormalName_CaseInsensitiveTagName_ReturnsNormalizedTagName {

    @Test
    public void testNormalName_CaseInsensitiveTagName_ReturnsNormalizedTagName() {
        String tagName = "div";
        String actualName = Tag.normalName(tagName);
        assertNotNull(actualName);
        assertEquals("div", actualName);
    }

}