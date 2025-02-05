package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("Test");
        node.text("New Test");
        assertEquals("Text Node Text mismatch after set", "New Test", node.text());
    }

}