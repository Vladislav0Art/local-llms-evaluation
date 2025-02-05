package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        assertEquals("some text", new TextNode("some text").text());
    }

}