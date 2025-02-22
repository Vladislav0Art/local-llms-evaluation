package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsEmptyTest {

    // Test the isBlock() method

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());

        tag.empty = true;
        assertTrue(tag.isEmpty());
    }

}