package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlTail {

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

}