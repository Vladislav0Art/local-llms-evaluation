package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Element element = new Element("<div></div>");
        element.outerHtmlHead(null, 0);
        assertEquals("<div></div>", element.outerHtml());
    }

}