package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf tagWithSettings tagWithoutSettings_ReturnsTagInstance {

    @Test
    public void valueOf

    tagWithSettings tagWithoutSettings_ReturnsTagInstance() {
        ParseSettings settings = new ParseSettings();
        Tag actualTag1 = Tag.valueOf("div", settings);
        Tag actualTag2 = Tag.valueOf("div");
        assertNotNull(actualTag1);
        assertNotNull(actualTag2);
        assertEquals("div", actualTag1.getName());
        assertEquals("div", actualTag2.getName());
    }

}