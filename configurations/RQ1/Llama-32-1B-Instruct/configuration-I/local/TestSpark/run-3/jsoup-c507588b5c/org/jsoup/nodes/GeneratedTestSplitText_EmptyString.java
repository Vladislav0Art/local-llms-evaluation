package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestSplitText_EmptyString {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testSplitText_EmptyString() {
        TextNode text = new TextNode("");
        assertNull(text.splitText(-1));
    }

}