package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedToString_ReturnsStringRepresentation {

    @Test
    public void toString_ReturnsStringRepresentation() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.toString());
    }
}

}