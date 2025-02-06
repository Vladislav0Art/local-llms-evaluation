package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateWholeText {

    @Test
    public void createWholeText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text + text, textNode.getWholeText());
    }

}