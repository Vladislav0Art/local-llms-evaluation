package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlTail_Test {

    @Test
    public void outerHtmlTail_Test() {
        Document document = new Document();
        Element body = document.createElement("body");
        element.appendChild(body);
        assertEquals("<html><body>Hello, World!</body></html>", document.body.outerHtml());
    }

}