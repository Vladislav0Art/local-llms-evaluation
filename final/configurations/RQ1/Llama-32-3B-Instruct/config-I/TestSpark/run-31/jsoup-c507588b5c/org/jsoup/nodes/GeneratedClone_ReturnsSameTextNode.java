package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedClone_ReturnsSameTextNode {

    @Test
    public void clone_ReturnsSameTextNode() {
        String text = "Hello World";
        Node textNode = new NodeCloneTest(text);
        assertEquals(original, textNode);
    }

}