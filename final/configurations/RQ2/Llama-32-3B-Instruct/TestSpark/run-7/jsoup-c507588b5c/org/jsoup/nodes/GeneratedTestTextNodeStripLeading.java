package org.jsoup.nodes;

public class GeneratedTestTextNodeStripLeading {

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
    public void testTextNodeStripLeading() {
        TextNode node = new TextNode();
        assertEquals("", node.getWholeText());
        assertFalse(node.getWholeText().isBlank());

        when(node.getWholeText()).thenReturn("   ");
        String text = StringUtil.stripLeadingWhitespace(node.getWholeText());
        assertEquals("   ", text);
    }

}