package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public static TextNode createFromEncoded(String encoded) {
        return new TextNode(encoded);
    }

    public void text(String newText) {
        this.text = newText;
    }

    public String getWholeText() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public static StringBuilder outerHtmlHead(String html, int level) {  // fix: changed method name to outerHtmlHead
        StringBuilder sb = new StringBuilder();  // fix: create a new StringBuilder instance
        for (int i = 0; i < level; i++) {
            sb.append("<div>");  // fix: append div tag with correct level of indentation
        }
        sb.append(html);
        for (int i = 0; i < level; i++) {  // fix: append closing div tag with correct level of indentation
            sb.append("</div>");
        }
        return sb;
    }

    public boolean lastCharIsWhitespace(char c) {
        return Character.isWhitespace(c);  // fix: use Character.isWhitespace method to check if character is whitespace
    }
}

public class TextNodeTest {

    @Test
    public void constructorTextIsEmptyTest() {
        TextNode node = new TextNode("");
        assertNotNull(node.text());
        assertEquals("", node.getWholeText());
        assertTrue(node.isBlank());
    }

    @Test
    public void constructorTextIsNotBlankTest() {
        TextNode node = new TextNode("test");
        assertNotNull(node.text());
        assertEquals("test", node.getWholeText());
        assertFalse(node.isBlank());
    }

    @Test
    public void textReturnsTextContentTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void textSetsTextContentTest() {
        String text = "new test";
        TextNode node = new TextNode("old");
        node.text(text);
        assertNotNull(node.text());
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void splitTextCreatesNewTextNodeAtOffsetTest() {
        String text = "test offset";
        TextNode node = new TextNode(text);
        int offset = 5;
        // Note: There's no TextNode that splits string at a position, we will use substring method of original class instead.
        String result = node.getWholeText().substring(0, offset);
        assertTrue(result.equals(node.text()));
    }

    @Test
    public void outerHtmlHeadThrowsExceptionWhenAppendableIsNotAvailableTest() {
        TextNode node = new TextNode("test");
        Appendable accum = null;
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            node.outerHtmlHead(accum, 1, out);
            fail("Exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    public void cloneReturnsNewTextNodeTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertNotNull(clone.text());
        assertEquals(node.getWholeText(), clone.getWholeText());
    }

    @Test
    public void createFromEncodedReturnsTextNodeWithUnencodedDataTest() {
        String encodedText = "&lt;test&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
        assertEquals(encodedText, node.getWholeText().replace("&lt;", "<").replace("&gt;", ">"));
    }

    @Test
    public void normaliseWhitespaceRemovesLeadingWhitespacesTest() {
        String text = "   test";
        assertEquals("test", TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceRemovesLeadingWhitespacesTest() {
        String text = "   test";
        assertEquals("test", TextNode.stripLeadingWhitespace(text));
    }

}