package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_returnsAllText {

    @Test
    public void getWholeText_returnsAllText() {
        String text = "Hello\nWorld!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

}