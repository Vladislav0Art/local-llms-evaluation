package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode parentNode = mock(Element.class);
        when(parentNode.isBlock()).thenReturn(true);

        TextNode node = new TextNode("test text");
        node.setParentNode(parentNode);

        TextNode splitNode = node.splitText(5);

        assertEquals("test ", node.text());
        assertEquals("text", splitNode.text());
    }

}