package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNameNodeTest {

    @Test
    public void testNameNodeTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

}