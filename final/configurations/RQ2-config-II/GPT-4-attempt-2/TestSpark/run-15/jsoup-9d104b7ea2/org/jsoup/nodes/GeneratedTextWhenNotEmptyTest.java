package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedTextWhenNotEmptyTest {

    @Test
    public void textWhenNotEmptyTest() {
        TextNode node = new TextNode("Valid text");
        assertEquals("Valid text", node.text());
    }

}