package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Valid text");
        assertEquals("Valid text", node.getWholeText());
    }

}