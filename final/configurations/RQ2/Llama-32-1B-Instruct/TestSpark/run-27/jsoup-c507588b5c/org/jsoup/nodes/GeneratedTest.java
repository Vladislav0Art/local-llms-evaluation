package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNodeToString() {
        Node root = new Root();
        String expected = "<div id=\"root\" class=\"container\">";
        assertEquals(expected, root.toString());
    }

    @Test
    public void testOuterHtmlHead() {
        Node root = new Root();
        root.addChild(new Left("left", null));
        root.addChild(new Right("right", null));

        Node head = (Node) root.outerHtmlHead(0).getLeft().getBody().getTextContent();
        assertTrue(head.toString().contains("</head>"));

        Node body = (Node) root.outerHtmlTail(0).getRight().getBody().getTextContent();
        assertTrue(body.toString().contains("</body>"));
    }

    @Test
    public void testOuterHtmlTail() {
        Node root = new Root();
        root.addChild(new Left("left", null));
        root.addChild(new Right("right", null));

        Node head = (Node) root.outerHtmlHead(0).getLeft().getBody().getTextContent();
        assertTrue(head.toString().contains("</head>"));

        Node body = (Node) root.outerHtmlTail(0).getRight().getBody().getTextContent();
        assertTrue(body.toString().contains("</body>"));
    }

    @Test
    public void testIsBlank() {
        Node node = new Root();
        assertTrue(node.isBlank());
    }

    @Test
    public void testGetWholeText() {
        Node root = new Root();
        root.addChild(new Left("left", null));
        root.addChild(new Right("right", null));

        String expected = "left<br>right";
        assertEquals(expected, root.getWholeText());
    }

}