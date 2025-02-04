package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedClone_ReturnsExpectedTextNode {

    @Test
    public void clone_ReturnsExpectedTextNode() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        TextNode expected = new TextNode(text);
        assertEquals(expected, textNode.clone());
    }
}

public class Document {

    private ArrayList<Node> children;

    public Document() {
        this.children = new ArrayList<>();
    }

    public void appendChild(Node child) {
        this.children.add(child);
    }

    public int getSiblingIndex() {
        return 0;
    }

    public Node nextSibling() {
        return null;
    }

    public Node previousSibling() {
        return null;
    }
}

}