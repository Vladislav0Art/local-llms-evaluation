package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        String testString = "test    ";
        TextNode textNode = new TextNode("");
        textNode.text(testString);
        assertEquals("test", textNode.text());
    }

}