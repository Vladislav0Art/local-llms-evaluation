package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedOuterHtmlWorksCorrectly {

    @Test
    public void outerHtmlWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals("", document.outerHtml());
    }

}