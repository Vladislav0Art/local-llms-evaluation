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

public class GeneratedTestTextNodeBlank {

    @Test
    public void testTextNodeBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        Node expectedNode = mock(Node.class);
        when(expectedNode.toString()).thenReturn("");
        when(node.text()).thenReturn(expectedNode);
        Document document = new Document();
        document.add(new TextNode("Hello, World!"));
        document.add(new TextNode());

        Node resultNode = node.toString(document);
        assertEquals("", expectedNode.toString());
    }

}