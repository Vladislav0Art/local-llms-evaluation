package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.trim().isEmpty();
    }

    public String getText() {
        return text;
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implementation to create a new TextNode from an encoded string
        return null;
    }

    public void splitText(int offset) {
        // implementation to split the text at the given offset
    }

    public String getWholeText() {
        return this.text;
    }
}

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode(TEST_TEXT);
        assertEquals(TEST_TEXT, textNode.text());
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsText() {
        TextNode textNode = new TextNode(TEST_TEXT);
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt; World");
        assertEquals(TEST_TEXT, textNode.text());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode(TEST_TEXT);
        assertEquals(NORMALISED_TEXT, textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespace_GivenTextWithSpaces_ReturnsSpaceNormalisedString() {
        String result = TextNode.normaliseWhitespace("Hello   World");
        assertEquals("Hello World", result);
    }

}