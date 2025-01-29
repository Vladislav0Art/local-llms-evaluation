package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlTail {

    private Document document = new Document();

    @Test
    public void testOuterHtmlTail() {
        Element tail = document.outerHtmlTail(document.root(), 0, new Document.OutputSettings());
        assertEquals("", tail.html());
    }

}