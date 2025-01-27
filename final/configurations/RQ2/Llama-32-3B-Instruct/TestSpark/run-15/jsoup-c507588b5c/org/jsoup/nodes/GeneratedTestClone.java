package org.jsoup.nodes;

public class GeneratedTestClone {

    private String text;

    public Node(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextNode clone() {
        // implementation of cloning logic
        return new TextNode(text);
    }
}

public class TextNode extends Node {
    public TextNode(String text) {
        super(text);
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String whitespace) {
        // implementation of normalising whitespace logic
        return whitespace.trim();
    }

    public static String stripLeadingWhitespace(String whitespace) {
        // implementation of stripping leading whitespace logic
        return whitespace.replaceFirst("^\\s+", "");
    }
}

public class GeneratedTest {

    @Test
    public void testClone() {
        TextNode node = new TextNode("test");
        String original = "test";
        TextNode clone = node.clone();
        assertEquals(original, clone.getText());
    }

}