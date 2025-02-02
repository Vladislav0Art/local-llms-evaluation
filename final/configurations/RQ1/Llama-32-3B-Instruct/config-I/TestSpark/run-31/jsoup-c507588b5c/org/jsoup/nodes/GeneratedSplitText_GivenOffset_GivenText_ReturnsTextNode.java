package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSplitText_GivenOffset_GivenText_ReturnsTextNode {

    @Test
    public void splitText_GivenOffset_GivenText_ReturnsTextNode() throws IOException {
        String text = "Hello World";
        Node textNode = new Node(text);
        int offset = 5;
        Node result = textNode.splitText(offset);
        assertNotNull(result);
    }

}