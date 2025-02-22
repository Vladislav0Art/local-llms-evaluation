package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeNodeName {

    @Test
    public void testTextNodeNodeName() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("#text", textNode.nodeName());
    }

}