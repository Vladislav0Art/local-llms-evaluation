package org.jsoup.nodes;

public class GeneratedTestNonBlank {

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
    public void testNonBlank() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}