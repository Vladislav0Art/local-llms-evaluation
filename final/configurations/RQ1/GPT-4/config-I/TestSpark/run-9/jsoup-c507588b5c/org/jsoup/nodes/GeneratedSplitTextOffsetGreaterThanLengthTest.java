package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetGreaterThanLengthTest {

    @Test
    public void splitTextOffsetGreaterThanLengthTest() {
        TextNode node = new TextNode("Test");

        node.splitText(5);
    }

}