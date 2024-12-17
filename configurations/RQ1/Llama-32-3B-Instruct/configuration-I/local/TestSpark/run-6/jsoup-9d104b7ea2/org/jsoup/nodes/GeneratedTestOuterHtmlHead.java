package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = Jsoup.parse("<html><head>...</head></html>");
        OuterHtmlHead head = new OuterHtmlHead(document);
        assertEquals("head content", head.getContent());
    }

}