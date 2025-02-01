package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode node = new TextNode("some text");
        assertEquals("some text", node.getWholeText());
    }

}