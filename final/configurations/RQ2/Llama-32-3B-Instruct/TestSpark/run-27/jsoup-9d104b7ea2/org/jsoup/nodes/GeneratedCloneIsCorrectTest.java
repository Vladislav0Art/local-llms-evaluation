package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCloneIsCorrectTest {

    @Test
    public void cloneIsCorrectTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertEquals(node.text(), clone.text());
    }

}