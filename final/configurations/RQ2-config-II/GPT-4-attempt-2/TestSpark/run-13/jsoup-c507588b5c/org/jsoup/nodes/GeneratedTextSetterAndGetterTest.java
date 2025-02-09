package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTextSetterAndGetterTest {

    @Test
    public void textSetterAndGetterTest() {
        TextNode node = new TextNode("Test");
        node.text("NewTest");
        assertEquals("NewTest", node.text());
    }

}