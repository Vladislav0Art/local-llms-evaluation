package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitTextOffsetCorrectTest {

    @Test
    public void splitTextOffsetCorrectTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode result1 = node.splitText(0);
        assertEquals("Hello", result1.text());
        assertEquals("World", node.text());

        TextNode result2 = node.splitText(node.text().length());
        assertEquals("", result2.text());
    }

}