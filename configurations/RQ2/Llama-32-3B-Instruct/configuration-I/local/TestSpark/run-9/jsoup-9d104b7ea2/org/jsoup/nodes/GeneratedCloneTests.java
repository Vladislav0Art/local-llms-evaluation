package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTests {

    @Test
    public void cloneTests() {
        String text = "Hello World";
        TextNode node1 = new TextNode(text);
        TextNode cloned = node1.clone();
        assertEquals(text, cloned.text());
    }

}