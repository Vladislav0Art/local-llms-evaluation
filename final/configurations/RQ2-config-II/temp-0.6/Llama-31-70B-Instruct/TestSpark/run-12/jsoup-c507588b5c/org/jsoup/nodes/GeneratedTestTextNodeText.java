package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestTextNodeText {

    @Test
    public void testTextNodeText() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.text());
    }

}