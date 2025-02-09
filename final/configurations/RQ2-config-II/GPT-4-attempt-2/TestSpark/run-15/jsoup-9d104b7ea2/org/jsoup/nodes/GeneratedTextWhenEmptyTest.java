package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedTextWhenEmptyTest {

    @Test
    public void textWhenEmptyTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}