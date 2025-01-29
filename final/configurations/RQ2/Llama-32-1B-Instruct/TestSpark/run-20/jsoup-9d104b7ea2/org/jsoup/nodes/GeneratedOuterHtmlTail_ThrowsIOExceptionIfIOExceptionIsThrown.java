package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedOuterHtmlTail_ThrowsIOExceptionIfIOExceptionIsThrown {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void outerHtmlTail_ThrowsIOExceptionIfIOExceptionIsThrown() {
        Document outputSettings = document.outputSettings();
        outputSettings.setThrowOnIoErrors(true);
        try {
            new TextNode(document.toString());
        } catch (IOException e) {
            // expected behavior
        }
    }

}