package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedSplitTextExceptionTest {

    @Test
    public void splitTextExceptionTest() {
        TextNode node = new TextNode("Test");
        node.splitText(5);
    }

}