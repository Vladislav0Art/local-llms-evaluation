package org.jsoup.nodes;

public class GeneratedTest {

    private LeafNode parentNode;
    private Document document;

    @Mock
    private String expectedText;

    public void testIsBlank() {
        given(getWholeText()).willReturn("");
        verify(isBlank()).isBlank();
        verify(not).isBlank(anyString());
    }

    public void testSplitText() {
        when(getWholeText()).thenReturn("  Hello World");
        TextNode result = splitText(5);
        assertEquals("Hello World", result.text().trim());
    }

    public void testTrimmingLeadingTrailingWhitespace() {
        String text = "   Hello   World! ";
        verify(trimLikeBlock()).trimLeading(text.length());
        verify(trimTrailing()).trimLikeBlock();
        verify(not).trimLikeBlock(anyString());
    }

    public void testOuterHtmlHead() {
        document = new Document();
        given(getWholeText()).willReturn("Hello\nWorld");
        parentNode = null;
        innerTest();
    }

    private void innerTest() {
        TextNode root = new TextNode(expectedText);
        root.outerHtmlHead(null, 1, null).perform(document);
        verify(normaliseWhitespace(root.text())).startsWith("");
    }

    public void testOuterHtmlTail() {
        document = new Document();
        given(getWholeText()).willReturn("Hello\nWorld");
        parentNode = null;
        innerTest();
    }

    private void innerTest() {
        TextNode root = new TextNode(expectedText);
        root.outerHtmlHead(null, 1, null).perform(document);
        verify(normaliseWhitespace(root.text())).trimLikeBlock(false);
        verify(not).trimLikeBlock(anyString());
    }

    public void testGetWholeTextTrimmingLeadingTrailingWhitespace() {
        String text = "   Hello   World! ";
        given(getWholeText()).willReturn(text);
        TextNode result = root = splitText(5);
        assertEquals(text, result.text().trim());
    }

    public void testGetWholeTextTrimmingLeadingTrailingWhitespaceInBlock() {
        document = new Document();
        given(getWholeText()).willReturn("Hello<BR>World");
        parentNode = null;
        innerTest();
    }

    @Test
    public void testCreateFromEncoded() {
        given(getWholeText()).thenReturn("Hello World");
        TextNode result = createFromEncoded(expectedText);
        assertEquals(expectedText, result.text());
    }

}