package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestShouldIndent {

    @Test
    public void testShouldIndent() {
        Document document = new Document();
        document.outputSettings().indentLevel = 4;
        assertTrue(Element.shouldIndent(document, 0));
    }

}