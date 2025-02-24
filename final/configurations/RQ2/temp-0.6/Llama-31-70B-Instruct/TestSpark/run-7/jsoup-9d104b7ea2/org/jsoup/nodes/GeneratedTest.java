package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Test");
        TextNode newTextNode = textNode.text("New Test");
        assertEquals("New Test", newTextNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("  ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("st", newTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("Test", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("Test", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.toString());
    }

}