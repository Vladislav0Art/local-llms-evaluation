package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String text = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals(node.getWholeText(), "Hello, World!");
    }

}