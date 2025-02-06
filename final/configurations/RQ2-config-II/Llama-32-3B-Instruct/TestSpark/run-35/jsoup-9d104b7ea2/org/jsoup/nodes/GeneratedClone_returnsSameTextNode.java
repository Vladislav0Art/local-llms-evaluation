package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_returnsSameTextNode {

    @Test
    public void clone_returnsSameTextNode() {
        String text = "Hello";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertEquals(node.text(), cloned.text());
    }

}