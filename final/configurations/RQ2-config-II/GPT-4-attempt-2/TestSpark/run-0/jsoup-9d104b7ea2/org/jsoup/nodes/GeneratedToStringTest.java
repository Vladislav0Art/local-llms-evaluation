package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("Test Node");
        assertEquals("Test Node", node.toString());
    }

}