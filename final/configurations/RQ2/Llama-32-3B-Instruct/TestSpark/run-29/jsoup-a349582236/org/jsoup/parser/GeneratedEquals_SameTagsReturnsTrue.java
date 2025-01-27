package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_SameTagsReturnsTrue {

    @Test
    public void equals_SameTagsReturnsTrue() {
        Tag tag1 = Tag.valueOf("<div>");
        Tag tag2 = Tag.valueOf("<div>");
        assertTrue(tag1.equals(tag2));
    }

}