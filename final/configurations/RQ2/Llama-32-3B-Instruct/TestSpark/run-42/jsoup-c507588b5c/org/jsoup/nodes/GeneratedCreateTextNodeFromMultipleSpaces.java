package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateTextNodeFromMultipleSpaces {

    @Test
    public void createTextNodeFromMultipleSpaces() {
        String expected = "   ";
        assertSame(expected, TextNode.createFromEncoded("   "));
    }

}