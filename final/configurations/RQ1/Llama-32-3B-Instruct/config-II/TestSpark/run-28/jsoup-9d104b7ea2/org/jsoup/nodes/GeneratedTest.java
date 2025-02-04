package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);

        // then
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void nodeName_ReturnsCorrectValue() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

    @Test
    public void text_ReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String text = textNode.text();

        // then
        assertEquals("Hello World", text);
    }

    @Test
    public void coreValue_ReturnsEncodedText() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String encodedText = textNode.coreValue();

        // then
        assertEquals("&lt;Helo&amp; WWorl&amp;ld&gt;", encodedText);
    }

    @Test
    public void text_GivenEncodedText_ReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode(Entities.unescape("Hello &amp; World"));

        // when
        String text = textNode.text();

        // then
        assertEquals("Hello & World", text);
    }

    @Test
    public void isBlank_ReturnsTrueIfTextIsBlank() {
        // given
        TextNode textNode1 = new TextNode("   ");
        TextNode textNode2 = new TextNode("   ");

        // when
        boolean isBlank1 = textNode1.isBlank();
        boolean isBlank2 = textNode2.isBlank();

        // then
        assertTrue(isBlank1);
        assertTrue(isBlank2);
    }

    @Test
    public void splitText_SplitsTextNodeAtGivenOffset() {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 5;

        // when
        TextNode result = textNode.splitText(offset);

        // then
        assertEquals(6, result.text().length());
    }

    @Test
    public void outerHtmlHead_SplitTextNodeAtGivenOffset() {
        // given
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = new TextNode("World");
        Element element = new Element(document, "div");

        document.appendChild(element);
        element.appendChild(splitTextNode);

        // when
        textNode.outerHtmlHead(accum, depth, out);

        // then
        assertEquals("<br>", accum.toString());
    }

    @Test
    public void outerHtmlTail_SplitTextNodeAtGivenOffset() {
        // given
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = new TextNode("World");

        // when
        textNode.outerHtmlTail(accum, depth, out);

        // then
        assertEquals("", accum.toString());
    }

    @Test
    public void clone_ReturnsClone() {
        // given
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();

        // when
        TextNode result = (TextNode) cloned.clone();

        // then
        assertNotNull(result);
        assertEquals(original, result);
    }

    @Test
    public void createFromEncoded_ReturnsTextNode() {
        // given
        String encodedText = "&lt;Hello World&gt;";

        // when
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // then
        assertNotNull(textNode);
    }

}