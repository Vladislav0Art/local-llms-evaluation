package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTestPreserveWhitespaceTrue {

    @Test
    public void testPreserveWhitespaceTrue() {
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        assertTrue(tag.preserveWhitespace());
    }

}