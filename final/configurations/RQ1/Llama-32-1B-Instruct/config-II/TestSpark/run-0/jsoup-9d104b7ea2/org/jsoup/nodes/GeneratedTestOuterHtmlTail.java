package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable appendable = document.createOuterHtmlHead();
        TextNode textNode = new TextNode("Hello");
        textNode.outerHtmlTail(appendable, 0);
        assertTrue(appendable.toString().contains("</head></html>"));
    }

}