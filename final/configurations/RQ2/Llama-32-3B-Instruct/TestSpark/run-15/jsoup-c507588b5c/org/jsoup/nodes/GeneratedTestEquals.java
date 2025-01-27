package org.jsoup.nodes;

public class GeneratedTestEquals {

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
    public void testEquals() {
        String originalText1 = "test";
        String originalText2 = "test";
        TextNode node1 = new TextNode(originalText1);
        String originalText3 = "other";
        TextNode node2 = new TextNode(originalText3);
        boolean isEqual = assertEquals(node1, node2);
        assertFalse(isEqual);
    }

}