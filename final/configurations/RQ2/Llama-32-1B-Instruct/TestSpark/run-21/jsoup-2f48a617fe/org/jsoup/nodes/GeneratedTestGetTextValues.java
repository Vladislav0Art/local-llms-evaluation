package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetTextValues {

    public Document generateDocument(String comment) {
        return Jsoup.parse("html>body>" + "<div id=\"data\">" + comment + "</div>");
    }

    @Test
    public void testGetTextValues() {
        // Test with default value
        Elements textNode = new Elements();
        textNode.append(element).append(document.getElementById("data").text());
        String comment = "some data";
        Document document = generateDocument(comment);
        assertEquals(comment, element.text());

        // Test with custom value
        textNode.clear();
        textNode.append(new Element("test"));
        element.appendChild(textNode);
        commentData = "custom data";
        document = generateDocument(commentData);
        assertEquals(commentData, element.attr("textContent"));
    }

}