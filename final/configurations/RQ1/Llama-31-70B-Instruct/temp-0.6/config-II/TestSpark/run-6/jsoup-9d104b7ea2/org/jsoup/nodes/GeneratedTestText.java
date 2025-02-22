package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode(" text ");
        assertEquals("text", textNode.text());
    }

}