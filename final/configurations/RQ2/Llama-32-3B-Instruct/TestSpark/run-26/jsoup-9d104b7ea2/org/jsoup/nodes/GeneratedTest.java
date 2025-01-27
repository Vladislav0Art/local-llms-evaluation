package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public void setText(String text) {
    }

    public static String normalizeWhitespace(String str) {
    }

    public static Node createFromEncoded(String encodedText) {
    }

    public void splitText(int offset) {
    }

    public String outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
    }

    public String outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
    }

    public Node clone() {
    }
}

public class GeneratedTest {

    @Test
    public void nodeName_GivenText_ReturnsText() {
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text_GivenText_RetainsOriginalText() {
        when(textNode.text()).thenReturn("original text");
        String actual = textNode.text();
        assertEquals("original text", actual);
    }

    @Test
    public void getWholeText_GivenText_ReturnsText() {
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlank_GivenEmptyText_ReturnsTrue() {
        when(textNode.text()).thenReturn("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        when(textNode.text()).thenReturn("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsNormalisedText() {
        String result = TextNode.stripLeadingWhitespace("   text");
        assertEquals("text", TextNode.normaliseWhitespace(result));
    }

}