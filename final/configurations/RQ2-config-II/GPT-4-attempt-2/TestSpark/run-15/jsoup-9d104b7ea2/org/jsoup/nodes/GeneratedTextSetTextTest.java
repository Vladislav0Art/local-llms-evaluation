package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetTextTest {

    @Test
    public void textSetTextTest() {
        TextNode node = new TextNode("");
        node.text("Valid text");
        assertEquals("Valid text", node.text());
    }

}