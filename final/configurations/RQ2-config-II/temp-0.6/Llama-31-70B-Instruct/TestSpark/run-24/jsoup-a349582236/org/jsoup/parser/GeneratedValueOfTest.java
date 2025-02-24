package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        // Test 1 - Tag name is null
        Tag tag = Tag.valueOf(null, null);
        assertNull(tag);

        // Test 2 - Tag name is empty
        tag = Tag.valueOf("", null);
        assertNull(tag);

        // Test 3 - Tag name is not empty
        tag = Tag.valueOf("test", null);
        assertNotNull(tag);
        assertEquals("test", tag.getName());
    }

}