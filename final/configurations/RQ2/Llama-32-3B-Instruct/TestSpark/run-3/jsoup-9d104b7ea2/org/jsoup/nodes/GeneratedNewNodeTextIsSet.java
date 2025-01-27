package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedNewNodeTextIsSet {

    @Test
    public void newNodeTextIsSet() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}