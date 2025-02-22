package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestText_SetText {

    @Test
    public void testText_SetText() {
        TextNode textNode = new TextNode(" text ");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}