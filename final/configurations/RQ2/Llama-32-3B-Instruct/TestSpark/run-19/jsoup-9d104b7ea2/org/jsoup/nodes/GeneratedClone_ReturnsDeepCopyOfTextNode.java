package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedClone_ReturnsDeepCopyOfTextNode {

    @Test
    public void clone_ReturnsDeepCopyOfTextNode() {
        String initialText = "HelloWorld";
        TextNode node = new TextNode(initialText);
        TextNode cloned = node.clone();
        assertNotSame(node, cloned);
        assertEquals(initialText, cloned.text());
    }

}