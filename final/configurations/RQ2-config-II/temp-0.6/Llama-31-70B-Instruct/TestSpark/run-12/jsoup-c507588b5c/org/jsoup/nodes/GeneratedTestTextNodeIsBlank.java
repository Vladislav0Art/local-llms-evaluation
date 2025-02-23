package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestTextNodeIsBlank {

    @Test
    public void testTextNodeIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}