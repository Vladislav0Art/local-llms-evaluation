package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(node.text(), "Hello, World!");

        TextNode changedNode = node.text("Changed text");
        assertEquals(changedNode.text(), "Changed text");
    }

}