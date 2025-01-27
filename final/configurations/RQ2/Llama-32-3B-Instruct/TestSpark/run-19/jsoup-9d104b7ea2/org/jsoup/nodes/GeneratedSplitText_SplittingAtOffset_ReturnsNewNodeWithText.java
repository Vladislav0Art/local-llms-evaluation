package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedSplitText_SplittingAtOffset_ReturnsNewNodeWithText {

    @Test
    public void splitText_SplittingAtOffset_ReturnsNewNodeWithText() {
        String initialText = "HelloWorld";
        TextNode node = new TextNode(initialText);
        TextNode newNode = node.splitText(6);
        assertEquals("World", newNode.text());
        assertNotSame(node, newNode);
    }

}