package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testBlank() {
        TextNode textNode = new TextNode("");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "   Hello   World  ";
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(6);
        assertEquals(tailNode, textNode);
        assertNotNull(tailNode.getWholeText());
        assertTrue(tailNode.isBlank());
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable appendable = document.createOuterHtmlHead();
        TextNode textNode = new TextNode("Hello");
        textNode.outerHtmlHead(appendable, 0, document.OutputSettings.PRETTY_PRINT);
        assertTrue(appendable.toString().contains("<html><head></head></html>"));
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable appendable = document.createOuterHtmlHead();
        TextNode textNode = new TextNode("Hello");
        textNode.outerHtmlTail(appendable, 0);
        assertTrue(appendable.toString().contains("</head></html>"));
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("");
        assertEquals("<text>", textNode.toString());
    }

}