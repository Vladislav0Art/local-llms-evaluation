package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestWholeText {

    @Test
    public void testWholeText() {
        Element element = new Element("<p>This is the whole text of this paragraph.</p>");
        String wholeText = element.wholeText();
        assertTrue(wholeText.length() > 0);
    }

}