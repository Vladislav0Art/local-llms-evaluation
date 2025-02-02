package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testCommentOuterHtmlHead() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        assertEquals("#comment", comment.nodeName());

        String data = elementToString(comment);
        assertTrue(data.contains("#Hello, world!"));
    }

    @Test
    public void testCommentOuterHtmlHead_2() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        assertEquals("<!--Hello, world!-->", elementToString(comment));
    }

    @Test
    public void testCommentOuterHtmlHead_3() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        assertTrue(elementIsXmlDeclaration(comment));
    }

    @Test
    public void testParseSettingsPreserveCase() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        ParseSettings settings = document.getSettings();
        assertEquals(ParseSettings.PRESERVE_CASE, settings);
    }

    @Test
    public void testGetElementToString() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        String data = elementToString(comment);
        System.out.println(data);
    }

    private String elementToString(Element element) {
        StringBuilder sb = new StringBuilder();
        for (String attr : element.attributes()) {
            sb.append(attr).append("=\"").append(element.attr(attr)).append("\" ");
        }
        return sb.toString().trim();
    }

    private boolean elementIsXmlDeclaration(Element element) {
        return element.tagName().equals("xml:declaration");
    }

}