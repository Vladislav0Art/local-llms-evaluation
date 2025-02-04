package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText

    ReturnsCorrectText() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);

        // then
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeName_ReturnsExpectedString() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

    @Test
    public void isBlank_GivenEmptyText

    ReturnsTrue() {
        // given
        TextNode textNode = new TextNode("");

        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertTrue(isBlank);
    }

    @Test
    public void isBlank_GivenNonEmptyText

    ReturnsFalse() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertFalse(isBlank);
    }

    @Test
    public void splitText_GivenOffsetReturnsCorrectTextNode() throws IOException {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;

        // when
        TextNode tailNode = textNode.splitText(offset);

        // then
        assertEquals(8, tailNode.text().length());
    }

    @Test
    public void splitText_GivenOffsetThrowOutOfBoundsException() {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 11;

        // when and then
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

    @Test
    public void outerHtmlHead_AppendsToAccumulator() throws IOException {
        // given
        Appendable accumulator = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        // when
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accumulator, 0, outputSettings);

        // then
        assertEquals("<p>Hello World</p>", accumulator.toString());
    }

    @Test
    public void outerHtmlTail_AppendsToAccumulator() throws IOException {
        // given
        Appendable accumulator = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        // when
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accumulator, 0, outputSettings);

        // then
        assertEquals("", accumulator.toString());
    }

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        // given
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");

        // when
        String outerHtml = textNode.toString();

        // then
        assertEquals("<p>Hello World</p>", outerHtml);
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        TextNode clonedTextNode = textNode.clone();

        // then
        assertEquals("Hello World", clonedTextNode.text());
    }

}