package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedIsBlank_textIsEmptyOrOnlyWhitespace {

    @Test
    public void isBlank_textIsEmptyOrOnlyWhitespace() {
        // [MethodUnderTest][Scenario]Test
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());

        String text2 = "   ";
        TextNode textNode2 = new TextNode(text2);
        assertTrue(textNode2.isBlank());
    }

}