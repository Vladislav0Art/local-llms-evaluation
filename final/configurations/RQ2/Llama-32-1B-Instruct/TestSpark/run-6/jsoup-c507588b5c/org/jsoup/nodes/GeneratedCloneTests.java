package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTests {

    @Test
    public void cloneTests() {
        TextNode textNode1 = new TextNode("Hello");
        TextNode textNode2 = textNode1.clone();
        assertNotNull(textNode2);
        assertEquals(textNode1, textNode2);
    }

}