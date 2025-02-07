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

public class GeneratedTestTextNodeSubstring {

    @Test
    public void testTextNodeSubstring() {
        String text = "   Hello, World!";
        TextNode node = new TextNode(text);
        when(node.text()).thenReturn(new TextNode("Hello"));
        Document document = new Document();
        document.add(new TextNode("Hello"));

        Node resultNode = node.toString(document);
        assertEquals("Hello", resultNode.toString());
    }

}