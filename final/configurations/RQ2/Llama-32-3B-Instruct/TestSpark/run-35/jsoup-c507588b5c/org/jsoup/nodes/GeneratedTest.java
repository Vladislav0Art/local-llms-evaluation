package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        String result = node.nodeName();

        // Then:
        assertEquals("", result);
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        String result = node.text();

        // Then:
        assertEquals("", result);
    }

    @Test
    public void text_SingleCharacterText_ReturnsSingleCharacterText() {
        // Given:
        TextNode node = new TextNode("a");

        // When:
        String result = node.text();

        // Then:
        assertEquals("a", result);
    }

    @Test
    public void text_MultipleCharactersText_ReturnsMultipleCharactersText() {
        // Given:
        TextNode node = new TextNode("hello");

        // When:
        String result = node.text();

        // Then:
        assertEquals("hello", result);
    }

    @Test
    public void getWholeText_EmptyTextNode_ThrowsIOException() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        assertThrows(IOException.class, () -> node.getWholeText());
    }

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        boolean result = node.isBlank();

        // Then:
        assertTrue(result);
    }

    @Test
    public void isBlank_SingleCharacterText_ReturnsFalse() {
        // Given:
        TextNode node = new TextNode("a");

        // When:
        boolean result = node.isBlank();

        // Then:
        assertFalse(result);
    }

    @Test
    public void splitText_SplittingAtStart_ReturnsTextNodeWithEmptyText() {
        // Given:
        TextNode node = new TextNode("hello");
        int offset = 0;

        // When:
        TextNode result = node.splitText(offset);

        // Then:
        assertEquals(1, result.text().length());
    }

    @Test
    public void splitText_SplittingAtMiddle_ReturnsTextNodeWithSingleCharacterText() {
        // Given:
        TextNode node = new TextNode("hello");
        int offset = 5;

        // When:
        TextNode result = node.splitText(offset);

        // Then:
        assertEquals(1, result.text().length());
    }

    @Test
    public void splitText_SplittingAtEnd_ReturnsTextNodeWithSingleCharacterText() {
        // Given:
        TextNode node = new TextNode("hello");
        int offset = 6;

        // When:
        TextNode result = node.splitText(offset);

        // Then:
        assertEquals(1, result.text().length());
    }

    @Test
    public void outerHtmlHead_EmptyTextNode_ReturnsNoOutput() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // When:
        node.outerHtmlHead(accum, depth, out);

        // Then:
        assertTrue(accum.isEmpty());
    }

    @Test
    public void outerHtmlTail_EmptyTextNode_ReturnsNoOutput() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // When:
        node.outerHtmlTail(accum, depth, out);

        // Then:
        assertTrue(accum.isEmpty());
    }

    @Test
    public void outerHtmlHead_SingleCharacterText_ReturnsSingleCharacter() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        TextNode node = new TextNode("a");

        // When:
        node.outerHtmlHead(accum, depth, out);

        // Then:
        assertEquals("a", accum.toString());
    }

    @Test
    public void outerHtmlTail_SingleCharacterText_ReturnsSingleCharacter() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        TextNode node = new TextNode("a");

        // When:
        node.outerHtmlTail(accum, depth, out);

        // Then:
        assertEquals("a", accum.toString());
    }

    @Test
    public void clone_ReturnsSameTextNode() {
        // Given:
        TextNode original = new TextNode("hello");
        TextNode expected = original;

        // When:
        TextNode result = original.clone();

        // Then:
        assertSame(expected, result);
    }

}