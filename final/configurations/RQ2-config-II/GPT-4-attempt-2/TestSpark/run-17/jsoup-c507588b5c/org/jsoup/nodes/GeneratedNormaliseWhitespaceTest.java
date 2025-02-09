package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("     test     text     ");
        assertEquals(" test text ", result);
    }

}