package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable appendable = document.createOuterHtmlHead();
        TextNode textNode = new TextNode("Hello");
        textNode.outerHtmlHead(appendable, 0, document.OutputSettings.PRETTY_PRINT);
        assertTrue(appendable.toString().contains("<html><head></head></html>"));
    }

}