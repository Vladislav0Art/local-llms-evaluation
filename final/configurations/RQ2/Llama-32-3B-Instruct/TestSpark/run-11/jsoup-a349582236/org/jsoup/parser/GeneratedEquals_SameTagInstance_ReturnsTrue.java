package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_SameTagInstance_ReturnsTrue {

    @Test
    public void equals_SameTagInstance_ReturnsTrue() {
        String tagName = "p";
        Tag tag1 = Tag.valueOf(tagName);
        Tag tag2 = Tag.valueOf(tagName);
        assertTrue(tag1.equals(tag2));
    }

}