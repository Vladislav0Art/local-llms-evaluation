package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> node.splitText(0));
    }

}