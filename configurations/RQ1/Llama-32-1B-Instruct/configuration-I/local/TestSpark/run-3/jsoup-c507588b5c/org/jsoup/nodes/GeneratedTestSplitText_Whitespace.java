package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestSplitText_Whitespace {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testSplitText_Whitespace() {
        TextNode text = new TextNode("   ");
        assertNotNull(text.splitText(-1));
    }

}