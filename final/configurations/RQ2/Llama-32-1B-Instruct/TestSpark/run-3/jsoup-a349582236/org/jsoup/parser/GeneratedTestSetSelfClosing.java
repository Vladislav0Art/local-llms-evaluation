package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        Tag tag = new Tag();
        assertEquals(true, tag.setSelfClosing());
        assertTrue(tag.getSelfClosing());
    }

}