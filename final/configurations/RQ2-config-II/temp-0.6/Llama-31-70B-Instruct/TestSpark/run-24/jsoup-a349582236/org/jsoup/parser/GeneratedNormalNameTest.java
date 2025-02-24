package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        // Test 1 - Name is null
        Tag tag = new Tag();
        tag.name = null;
        assertEquals("", tag.normalName());

        // Test 2 - Name is empty
        tag.name = "";
        assertEquals("", tag.normalName());

        // Test 3 - Name is not empty
        tag.name = "test";
        assertEquals("test", tag.normalName());
    }

}