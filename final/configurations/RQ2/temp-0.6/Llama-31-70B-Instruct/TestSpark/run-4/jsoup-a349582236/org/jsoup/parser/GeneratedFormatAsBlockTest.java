package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFormatAsBlockTest {

    // Test the isBlock() method

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.formatAsBlock());

        tag.formatAsBlock = true;
        assertTrue(tag.formatAsBlock());
    }

}