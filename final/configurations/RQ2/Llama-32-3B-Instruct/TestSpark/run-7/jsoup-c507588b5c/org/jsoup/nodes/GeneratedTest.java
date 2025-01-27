package org.jsoup.nodes;

public class GeneratedTest {

    private String originalText;

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getWholeText() {
        return originalText;
    }
}

public class TestTextNode {

    @Test
    public void testTextNode() {
        TextNode node = new TextNode();
        assertEquals("", node.getWholeText());
        assertFalse(node.getWholeText().isBlank());

        when(node.getWholeText()).thenReturn("abcdefg");
        assertEquals("abcdefg", node.getWholeText());

        node.setOriginalText("");
        assertTrue(node.getWholeText().isBlank());
    }

    @Test
    public void testTextNodeStripLeading() {
        TextNode node = new TextNode();
        assertEquals("", node.getWholeText());
        assertFalse(node.getWholeText().isBlank());

        when(node.getWholeText()).thenReturn("   ");
        String text = StringUtil.stripLeadingWhitespace(node.getWholeText());
        assertEquals("   ", text);
    }

    @Test
    public void testTextNodeNormalise() {
        TextNode node = new TextNode();
        assertEquals("", node.getWholeText());
        assertFalse(node.getWholeText().isBlank());

        when(node.getWholeText()).thenReturn("abc  ");
        String text = StringUtil.normaliseWhitespace(node.getWholeText());
        assertEquals("abc", text);
    }

    @Test
    public void testTextNodeLastCharIsWhitespace() {
        TextNode node = new TextNode();
        assertEquals("", node.getWholeText());
        assertFalse(node.getWholeText().isBlank());

        when(node.getWholeText()).thenReturn(" abc");
        assertTrue(TextNode.lastCharIsWhitespace(node.getWholeText()));
    }
}

public class StringUtil {

    public static String stripLeadingWhitespace(String text) {
        return text.trim();
    }

    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static boolean lastCharIsWhitespace(String text) {
        char c = Character.toLowerCase(text.charAt(text.length() - 1));
        return c == ' ' || c == '\t' || c == '\r';
    }

}