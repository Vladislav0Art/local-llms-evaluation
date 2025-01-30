package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetNegativeTest {

    @Test
    public void splitTextOffsetNegativeTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        node.splitText(-7);
    }

}