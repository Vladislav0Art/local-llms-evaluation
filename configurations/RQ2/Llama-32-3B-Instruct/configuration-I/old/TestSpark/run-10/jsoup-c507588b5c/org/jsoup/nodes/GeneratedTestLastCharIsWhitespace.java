package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

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

    public static StringBuilder outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws Exception {
        // implementation of outerHtmlHead method here
        return null;
    }
}

public class TextNodeTest {

    @Test
    public void testLastCharIsWhitespace() {
        TextNode node = new TextNode();
        String text = "ab";
        assertTrue(!node.lastCharIsWhitespace(text.charAt(0)));
        assertTrue(node.lastCharIsWhitespace(charToBuilder(text.charAt(1))));
    }

    private static StringBuilder charToBuilder(char c) {  // fix: create a new StringBuilder instance
        return new StringBuilder(String.valueOf(c));
    }

}