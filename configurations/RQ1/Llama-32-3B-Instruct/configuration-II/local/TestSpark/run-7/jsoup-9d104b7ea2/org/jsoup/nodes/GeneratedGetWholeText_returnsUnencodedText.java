package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedGetWholeText_returnsUnencodedText {

    @Test
    public void getWholeText_returnsUnencodedText() {
        // [MethodUnderTest][Scenario]Test
        String text = "Hello \nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}