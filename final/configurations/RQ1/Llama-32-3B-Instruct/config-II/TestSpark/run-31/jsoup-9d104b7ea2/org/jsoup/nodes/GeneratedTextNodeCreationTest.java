package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedTextNodeCreationTest {

    @Test
    public void TextNodeCreationTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
        assertNotNull(textNode.text());
    }

}