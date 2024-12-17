package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedIsBlankMethodReturnsFalseForNonBlankTextNodeTest {

    @Test
    public void isBlankMethodReturnsFalseForNonBlankTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}