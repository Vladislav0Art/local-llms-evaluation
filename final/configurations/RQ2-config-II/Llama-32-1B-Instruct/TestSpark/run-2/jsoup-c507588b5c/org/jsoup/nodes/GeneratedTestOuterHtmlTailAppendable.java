package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTestOuterHtmlTailAppendable {

    @Test
    public void testOuterHtmlTailAppendable() throws IOException {
        Document document = new Document();
        Appendable accum = document.getOwnerDocument().getOutputStream().append("Hello\nWorld");
        TextNode tail = new TextNode(document, 0);
        tail.outerHtmlTail(accum, 1, null).toString();
    }

}