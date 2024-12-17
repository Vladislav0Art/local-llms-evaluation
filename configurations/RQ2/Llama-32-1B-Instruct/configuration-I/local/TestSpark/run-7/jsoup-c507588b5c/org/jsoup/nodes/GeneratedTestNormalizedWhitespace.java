package org.jsoup.nodes;

public class GeneratedTestNormalizedWhitespace {

    public static void main(String[] args) {
        TextNode textNode = new TextNode("   Hello, World!   ");

        // Test 1: Blank string
        assertTrue(textNode.isBlank());

        // Test 2: Empty string
        assertFalse(textNode.isBlank());

        // Test 3: Normalized whitespace
        assertEquals("Hello, World!", normaliseWhitespace(textNode.text()));

        // Test 4: Splitting text node at a specified offset
        TextNode splitTextNode = textNode.splitText(6);
        assertTrue(splitTextNode.text().trim().isEmpty()); // Empty string is returned if no text was found

        // Test 5: Clone method
        TextNode cloneTextNode = (TextNode) textNode.clone();
        assertTrue(cloneTextNode.text().equals(textNode.text()));

        // Test 6: Creating a new text node from HTML encoded data
        String encodedText = "&lt;Hello, World!&gt;";
        TextNode newText = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", newText.text());

        // Test 7: Creating a new text node with normalised whitespace and stripLeadingWhitespace
        StringBuilder sb = new StringBuilder();
        sstripLeadingWhitespace(sb, "&amp;");
        TextNode newTextNode = NormaliseWhitespace(textNode).createFromEncoded(sb.toString());
        assertEquals("Hello, World!", newTextNode.text());
    }

    @Test
    public void testNormalizedWhitespace() {
        assertEquals("Hello, World!", TextNode.normaliseWhitespace(TextNode.text()).impl().toString());
    }

}