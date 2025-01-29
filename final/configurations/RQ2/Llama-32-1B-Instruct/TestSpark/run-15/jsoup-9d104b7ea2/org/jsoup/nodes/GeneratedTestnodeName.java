package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestnodeName {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testnodeName() {
        TextNode node = createTextNode("Hello, World!");
        assertEquals(TextNode.class.getName(), node.getClass().getSimpleName());
    }

}