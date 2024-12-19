package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestOwnText {

    @Test
    public void testOwnText() {
        Element element = new Element("<div><span>Test span</span></div>");
        String ownText = element.ownText();
        assertTrue(ownText.length() > 0);
    }

}