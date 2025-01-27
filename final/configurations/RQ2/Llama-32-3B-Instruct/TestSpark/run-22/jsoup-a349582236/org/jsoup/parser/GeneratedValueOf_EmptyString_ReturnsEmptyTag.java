package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_EmptyString_ReturnsEmptyTag {

    @Test
    public void valueOf_EmptyString_ReturnsEmptyTag() {
        Tag tag = Tag.valueOf("", null);
        assertNotNull(tag);
        assertEquals("", tag.getName());
    }

}