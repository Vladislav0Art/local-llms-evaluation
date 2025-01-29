package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    public Document generateDocument(String comment) {
        return Jsoup.parse("html>body>" + "<div id=\"data\">" + comment + "</div>");
    }

    @Test
    public void testEquals() {
        String expectedOutput = "some data";
        Document document = generateDocument(expectedOutput);
        assertEquals(expectedOutput, document.toString());
    }

    @Test
    public void testGetText() {
        Element element = new Element("test");
        element.appendChild(new Element("text", "").append(element));
        String commentData = "some data";
        Document document = generateDocument(commentData);
        assertEquals(commentData, element.attr("textContent"));
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

    @Test
    public void testGetAttribute() {
        String expectedOutput = "some data";
        Document document = new Document();
        document.select("body").text(expectedOutput);
        assertEquals(expectedOutput, document.get("data").attr("textContent"));
    }

    @Test
    public void testGetTextContent() {
        String commentData = "some data";
        Document document = generateDocument(commentData);
        assertEquals(document.toString(), document.html());
        document.remove();
    }

}