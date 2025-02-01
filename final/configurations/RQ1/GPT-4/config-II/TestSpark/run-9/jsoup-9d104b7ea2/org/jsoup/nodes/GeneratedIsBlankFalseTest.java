package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankFalseTest {

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Hello");

        assertFalse(textNode.isBlank());
    }

}