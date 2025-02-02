package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeFilter;
import org.jsoup.nodes.PseudoElement;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.jsoup.select.Elements.matches;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestClone {

    @Mock
    private Document document;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings outputSettings;

    @Mock
    private Element parent;

    public void isBlank() {
        assertTrue(NodeFilter.matches(0, getNode().getText()));
    }

    public void splitText(int offset) {
        Node node = new TextNode("Hello World");
        node.splitText(offset);
        assertNotSame(node, getNode());
    }

    @Test
    public void testClone() throws IOException {
        Document document = new Document();
        Node parent = new TextNode(document.createTextNode("Hello World"));
        parent.parentNode = document;
        parent.parentNode.appendChild(parent);
        Node clone = document.cloneNode();
        assertEquals(parent, clone);
    }

}