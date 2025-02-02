package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestGetElementToString {

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