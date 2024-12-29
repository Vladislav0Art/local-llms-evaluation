package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestOuterHtmlTail_MultiLineText {

    @Test
    public void testOuterHtmlTail_MultiLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode2 = TextNode.createText("Hello,\n World!");
        textNode2.outerHtmlTail(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode2.outerHtml()));
    }

}