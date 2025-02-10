package org.jsoup.nodes;

public class GeneratedTestTextSplit {

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
    public void testTextSplit() {
        TextNode node = new TextNode("Hello World");
        node.splitText(5);
        assertTrue(node.getWholeText().equals("Hello"));
        assertTrue(node.isBlank());
    }

}