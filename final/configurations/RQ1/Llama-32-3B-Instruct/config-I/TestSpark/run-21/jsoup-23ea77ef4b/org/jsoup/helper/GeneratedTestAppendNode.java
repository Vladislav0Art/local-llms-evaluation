package org.jsoup.helper;

public class GeneratedTestAppendNode {

    private Document doc;

    public XmlToJsoup() {
    }

    public void head(Node source, int depth) {
    }

    public void tail(Node source, int depth) {
    }

    public Element createElementNS(String namespaceURI, String localName) {
    }

    public Text createTextNode(String data) {
    }

    public Comment createComment(String data) {
    }

    public Node append(Node parent, Node child) {
    }

    public static class Document {
        // Implement Document class
    }

    public static class Node {
        // Implement Node class
    }

    public static class Element extends Node {
        // Implement Element class
    }

    public static class Text extends Node {
        // Implement Text class
    }

    public static class Comment extends Node {
        // Implement Comment class
    }
}

public class XmlToJsoupTest {

    @Test
    public void testAppendNode() {
        XmlToJsoup xmlToJsoup = new XmlToJsoup();
        Element element = xmlToJsoup.dest;
        Node child = new Node();
        xmlToJsoup.append(element, child);
        assertEquals(child, xmlToJsoup.append(element, child));
    }

}