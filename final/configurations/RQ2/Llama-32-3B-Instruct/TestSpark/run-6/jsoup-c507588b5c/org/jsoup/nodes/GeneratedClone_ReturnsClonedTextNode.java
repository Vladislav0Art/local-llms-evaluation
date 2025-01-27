package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedClone_ReturnsClonedTextNode {

    @Test
    public void clone_ReturnsClonedTextNode() throws CloneNotSupportedException {
        String text = "Hello";
        TextNode textNode1 = new TextNode(text);
        TextNode textNode2 = (TextNode) textNode1.clone();
        assertEquals(text, textNode2.text());
    }

}