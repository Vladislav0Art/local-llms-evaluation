package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestSplitText_MultipleCharactersString {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testSplitText_MultipleCharactersString() {
        TextNode text = createTextNode("hello world");
        assertNotNull(text.splitText(7).text());
    }

}