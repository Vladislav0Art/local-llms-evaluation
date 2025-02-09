package org.jsoup.nodes;

public class GeneratedTest {

    private String encodedText;

    public TextNode() {
        this.encodedText = "";
    }

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }

    public String getEncodedText() {
        return encodedText;
    }
}

public class GeneratedTest {

    @Test
    public void nodeName_IsTextNode_ReturnsNodeName() {
        TextNode node = new TextNode("text");
        assertEquals("TextNode", node.nodeName());
    }

    @Test
    public void text_GetTextReturnsEncodedText() {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void getWholeText_GettingTextReturnsEncodedText() {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertEquals(encodedText, node.getWholeText());
    }

    @Test
    public void isBlank_IsBlank_ReturnsTrueForEmptyString() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_IsNotBlank_ReturnsFalseForNonEmptyString() {
        TextNode node = new TextNode("text");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitText_SplittingAtOffsetReturnsNewTextNode() {
        TextNode node = new TextNode("text");
        TextNode newNode = node.splitText(0);
        assertNotNull(newNode);
    }

    @Test
    public void toString_ReturnsEncodedText() {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertEquals("text", node.toString());
    }

    @Test
    public void clone_ClonesTextNode() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node, cloned);
    }

    @Test
    public void createFromEncoded_CreatesTextNodeFromEncodedText() {
        String encodedText = "text";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void stripLeadingWhitespace_StripsLeadingWhitespaceFromText() {
        String text = "   ";
        String expected = TextNode.stripLeadingWhitespace(text);
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespace_ReturnsTrueForLastWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder(" abc");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void createFromEncoded_CreatesTextNodeFromEncodedText() throws Exception {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void normaliseWhitespace_NormalisesWhitespaceInText() {
        String text = "   ";
        String expected = "   ";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

}