package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        // Test 1 - Name is null
        Tag tag = new Tag();
        tag.name = null;
        assertNull(tag.getName());

        // Test 2 - Name is empty
        tag.name = "";
        assertEquals("", tag.getName());

        // Test 3 - Name is not empty
        tag.name = "test";
        assertEquals("test", tag.getName());
    }

}