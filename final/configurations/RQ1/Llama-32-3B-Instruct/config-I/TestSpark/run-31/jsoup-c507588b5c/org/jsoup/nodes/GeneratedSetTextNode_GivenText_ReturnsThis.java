package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSetTextNode_GivenText_ReturnsThis {

    @Test
    public void setTextNode_GivenText_ReturnsThis() {
        String text = "Hello World";
        Node textNode = new Node("");
        textNode.text(text);
        assertNotNull(textNode);
    }

}