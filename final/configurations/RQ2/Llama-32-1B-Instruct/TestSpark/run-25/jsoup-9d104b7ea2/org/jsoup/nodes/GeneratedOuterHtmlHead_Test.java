package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlHead_Test {

    @Test
    public void outerHtmlHead_Test() {
        Document document = new Document();
        Element head = document.createElement("head");
        element.appendChild(head);
        assertEquals("<html><body>Hello, World!</body></html>", document.body.outerHtml());
    }

}