package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetTextContent {

    public Document generateDocument(String comment) {
        return Jsoup.parse("html>body>" + "<div id=\"data\">" + comment + "</div>");
    }

    @Test
    public void testGetTextContent() {
        String commentData = "some data";
        Document document = generateDocument(commentData);
        assertEquals(document.toString(), document.html());
        document.remove();
    }

}