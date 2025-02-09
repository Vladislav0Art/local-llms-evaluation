package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTextResetTest {

    @Test
    public void textResetTest() {
        TextNode node = new TextNode("Test");
        node.text("Reset");
        assertEquals("Reset", node.text());
    }

}