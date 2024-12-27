package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCloneReturnsNewTextNode {

    @Test
    public void testCloneReturnsNewTextNode() {
        Document document = Jsoup.parse("<html><body>Hello, <span>World!</span></body></html>");
        LeafNode childNode = new LeafNode("child");

        TextNode textNode1 = new TextNode("text1");
        TextNode textNode2 = new TextNode("text2").clone();
        assertEquals(new TextNode("text2"), textNode2);
    }

}