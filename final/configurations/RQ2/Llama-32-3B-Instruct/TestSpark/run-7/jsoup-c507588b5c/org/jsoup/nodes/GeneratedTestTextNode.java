package org.jsoup.nodes;

public class GeneratedTestTextNode {

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

}