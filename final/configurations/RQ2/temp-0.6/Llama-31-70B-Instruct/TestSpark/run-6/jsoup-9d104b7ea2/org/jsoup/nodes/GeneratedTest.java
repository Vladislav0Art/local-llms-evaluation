package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textModifyTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("modified");
        assertEquals("modified", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitText = textNode.splitText(2);
        assertNotNull(splitText);
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.outerHtmlHead(null, 0, null));
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.outerHtmlTail(null, 0, null));
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

}