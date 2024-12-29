package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestOuterHtmlTail_SingleLineText {

    @Test
    public void testOuterHtmlTail_SingleLineText() throws IOException {
        Document document = new Document();
        document.appendElement("html").appendAttribute("lang", "en").appendElement("head");

        TextNode textNode3 = TextNode.createText("Hello, World!");
        textNode3.outerHtmlTail(document, 1, Document.OutputSettings.build());
        assertTrue(TextNode.normaliseWhitespace(textNode3.outerHtml()));
    }

}