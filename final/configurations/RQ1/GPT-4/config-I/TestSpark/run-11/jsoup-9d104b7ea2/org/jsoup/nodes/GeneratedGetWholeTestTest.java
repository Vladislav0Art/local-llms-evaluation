package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTestTest {

    @Test
    public void getWholeTestTest() {
        String text = "test test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

}