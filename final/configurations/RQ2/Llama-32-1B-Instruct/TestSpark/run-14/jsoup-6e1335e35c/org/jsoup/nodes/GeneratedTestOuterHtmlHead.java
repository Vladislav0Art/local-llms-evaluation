package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    private Document document = new Document();

    @Test
    public void testOuterHtmlHead() {
        Element head = document.outerHtmlHead(document.root(), 1, new Document.OutputSettings());
        assertEquals("<head>\n", document.html(head));
    }

}