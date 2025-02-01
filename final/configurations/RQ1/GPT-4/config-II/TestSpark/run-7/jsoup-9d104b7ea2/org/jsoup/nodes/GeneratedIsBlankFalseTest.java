package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedIsBlankFalseTest {

    @Test
    public void isBlankFalseTest() {
        TextNode node = new TextNode("Test");
        assertFalse(node.isBlank());
    }

}