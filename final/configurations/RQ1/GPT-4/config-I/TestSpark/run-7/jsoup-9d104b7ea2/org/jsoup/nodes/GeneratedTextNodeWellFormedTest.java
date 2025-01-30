package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTextNodeWellFormedTest {

    @Test
    public void textNodeWellFormedTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals(node.text(), "Hello World");
        assertFalse(node.isBlank());
    }

}