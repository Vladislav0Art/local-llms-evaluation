package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        assertEquals("Stripped Text", TextNode.stripLeadingWhitespace("  \t\nStripped Text"));
    }

}