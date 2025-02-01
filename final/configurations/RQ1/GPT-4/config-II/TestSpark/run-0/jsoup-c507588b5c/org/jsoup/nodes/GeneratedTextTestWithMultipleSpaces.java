package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTestWithMultipleSpaces {

    @Test
    public void textTestWithMultipleSpaces() {
        String testString = "  Test String  ";
        TextNode textNode = new TextNode(testString);
        assertEquals("Test String", textNode.text());
    }

}