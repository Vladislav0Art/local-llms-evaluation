package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestOuterHtmlHead_MultiLineText {

    @Test
    public void testOuterHtmlHead_MultiLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode1 = TextNode.createText("Hello,\n World!");
        textNode1.outerHtmlHead(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode1.outerHtml()));
    }

}