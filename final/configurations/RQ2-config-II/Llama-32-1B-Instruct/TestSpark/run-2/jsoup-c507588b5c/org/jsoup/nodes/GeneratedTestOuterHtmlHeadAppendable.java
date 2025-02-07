package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTestOuterHtmlHeadAppendable {

    @Test
    public void testOuterHtmlHeadAppendable() throws IOException {
        Document document = new Document();
        Appendable accum = document.getOwnerDocument().getOutputStream().append("Hello\nWorld");
        TextNode head = new TextNode(document, 0);
        head.outerHtmlHead(accum, 1, null).toString();
    }

}