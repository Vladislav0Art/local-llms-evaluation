package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        assertEquals("Normalized Text", TextNode.normaliseWhitespace("Normalized \n\t\b Text"));
    }

}