package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedIsBlank_GivenNonEmptyText_ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        String text = "Hello World";
        Node textNode = new Node(text);
        assertFalse(textNode.isBlank());
    }

}