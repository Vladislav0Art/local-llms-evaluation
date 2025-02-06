package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextNodeTextIsNotNull {

    @Test
    public void createTextNodeTextIsNotNull() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node.text());
    }

}