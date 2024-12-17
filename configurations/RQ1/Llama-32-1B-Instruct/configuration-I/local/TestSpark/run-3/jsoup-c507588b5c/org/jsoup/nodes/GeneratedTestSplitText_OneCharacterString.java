package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestSplitText_OneCharacterString {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testSplitText_OneCharacterString() {
        TextNode text = createTextNode("a");
        assertNotNull(text.splitText(0).text());
    }

}