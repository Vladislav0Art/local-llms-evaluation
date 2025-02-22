package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlockTest {

    // Test the isBlock() method

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isBlock());

        tag.isBlock = true;
        assertTrue(tag.isBlock());
    }

}