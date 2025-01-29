package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetText {

    public Document generateDocument(String comment) {
        return Jsoup.parse("html>body>" + "<div id=\"data\">" + comment + "</div>");
    }

    @Test
    public void testGetText() {
        Element element = new Element("test");
        element.appendChild(new Element("text", "").append(element));
        String commentData = "some data";
        Document document = generateDocument(commentData);
        assertEquals(commentData, element.attr("textContent"));
    }

}