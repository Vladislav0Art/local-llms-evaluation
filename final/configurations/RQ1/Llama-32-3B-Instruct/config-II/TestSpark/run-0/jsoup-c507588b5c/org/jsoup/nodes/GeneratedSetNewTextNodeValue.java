package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetNewTextNodeValue {

    @Test
    public void setNewTextNodeValue() {
        TextNode node = new TextNode("");
        node.text("World");
        assertEquals("", node.text());
    }

}