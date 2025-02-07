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

public class GeneratedTestTextNodeClone {

    @Test
    public void testTextNodeClone() {
        String text = "   Hello, World!   ";
        TextNode node = new TextNode(text);
        when(node.text()).thenReturn(new TextNode(""));
        Document document = new Document();
        document.add(new TextNode("Hello"));
        Node parent = document.body().addChild(node);

        // Check that two clones have the same text
        Node clone1 = (TextNode) document.body().FirstChild().getNextSibling();
        Node clone2 = node.clone();

        assertEquals(text, clone1.toString());
        assertEquals(text, clone2.toString());
    }

}