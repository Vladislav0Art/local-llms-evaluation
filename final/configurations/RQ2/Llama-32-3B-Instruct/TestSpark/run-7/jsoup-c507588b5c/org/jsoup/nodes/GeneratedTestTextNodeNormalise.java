package org.jsoup.nodes;

public class GeneratedTestTextNodeNormalise {

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
    public void testTextNodeNormalise() {
        TextNode node = new TextNode();
        assertEquals("", node.getWholeText());
        assertFalse(node.getWholeText().isBlank());

        when(node.getWholeText()).thenReturn("abc  ");
        String text = StringUtil.normaliseWhitespace(node.getWholeText());
        assertEquals("abc", text);
    }

}