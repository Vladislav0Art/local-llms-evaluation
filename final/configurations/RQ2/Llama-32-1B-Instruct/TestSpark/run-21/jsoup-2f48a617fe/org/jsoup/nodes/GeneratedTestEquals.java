package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestEquals {

    public Document generateDocument(String comment) {
        return Jsoup.parse("html>body>" + "<div id=\"data\">" + comment + "</div>");
    }

    @Test
    public void testEquals() {
        String expectedOutput = "some data";
        Document document = generateDocument(expectedOutput);
        assertEquals(expectedOutput, document.toString());
    }

}