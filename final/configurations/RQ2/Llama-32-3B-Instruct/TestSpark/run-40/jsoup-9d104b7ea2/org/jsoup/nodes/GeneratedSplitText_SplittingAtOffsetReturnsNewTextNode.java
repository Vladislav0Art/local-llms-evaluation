package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedSplitText_SplittingAtOffsetReturnsNewTextNode {

    @Test
    public void splitText_SplittingAtOffsetReturnsNewTextNode() {
        TextNode node = new TextNode("text");
        TextNode newNode = node.splitText(0);
        assertNotNull(newNode);
    }

}