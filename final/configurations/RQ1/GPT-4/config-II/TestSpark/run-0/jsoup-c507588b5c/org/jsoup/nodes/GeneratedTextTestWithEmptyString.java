package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTestWithEmptyString {

    @Test
    public void textTestWithEmptyString() {
        String testString = "";
        TextNode textNode = new TextNode(testString);
        assertEquals("", textNode.text());
    }

}