package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Some text");
        TextNode cloneNode = node.clone();
        assertEquals(cloneNode.text(), node.text());
    }

}