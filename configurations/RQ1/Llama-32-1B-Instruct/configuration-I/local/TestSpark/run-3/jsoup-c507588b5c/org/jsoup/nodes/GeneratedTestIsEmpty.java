package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestIsEmpty {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testIsEmpty() {
        assertNull(createTextNode("").splitText(0).text());
        assertNull(createTextNode("   ").splitText(-1));
    }

}