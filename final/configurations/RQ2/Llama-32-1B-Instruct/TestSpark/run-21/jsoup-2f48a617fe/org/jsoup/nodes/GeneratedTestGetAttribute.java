package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetAttribute {

    public Document generateDocument(String comment) {
        return Jsoup.parse("html>body>" + "<div id=\"data\">" + comment + "</div>");
    }

    @Test
    public void testGetAttribute() {
        String expectedOutput = "some data";
        Document document = new Document();
        document.select("body").text(expectedOutput);
        assertEquals(expectedOutput, document.get("data").attr("textContent"));
    }

}