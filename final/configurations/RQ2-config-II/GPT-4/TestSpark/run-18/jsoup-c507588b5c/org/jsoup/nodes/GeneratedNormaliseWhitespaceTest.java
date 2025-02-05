package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "    Normalize   this  text     ";
        assertTrue("Normalize this text", TextNode.normaliseWhitespace(text).equals("Normalize this text"));
    }

}