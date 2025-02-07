package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestTextNodeRemoveWhitespace {

    @Test
    public void testTextNodeRemoveWhitespace() {
        String text = "   Hello, World!   ";
        TextNode node = new TextNode(text);
        when(node.text()).thenReturn(new TextNode(""));
        Document document = new Document();
        document.add(new TextNode("Hello"));
        document.add(new TextNode("World!"));

        Node resultNode = node.toString(document);
        assertEquals("", resultNode.toString());
    }

}