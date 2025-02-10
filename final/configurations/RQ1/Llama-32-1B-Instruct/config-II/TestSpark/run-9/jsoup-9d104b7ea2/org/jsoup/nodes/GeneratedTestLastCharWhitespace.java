package org.jsoup.nodes;

public class GeneratedTestLastCharWhitespace {

}

public class TextNodeImpl extends LeafNode {

    private String value;

    @Override
    public void clone() {
        return new TextNodeImpl(value);
    }

    public TextNode clone(String newText) {
        return new TextNodeImpl(newText);
    }

    public static TextNode createFromEncoded(String encodedText) {
        return new TextNode(fromEncoded(encodedText));
    }

    private static String fromEncoded(String encodedText) {
        returnEntities.unescape(encodedText);
    }
}

public class TextNodeTests {

    @Test
    public void testLastCharWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}