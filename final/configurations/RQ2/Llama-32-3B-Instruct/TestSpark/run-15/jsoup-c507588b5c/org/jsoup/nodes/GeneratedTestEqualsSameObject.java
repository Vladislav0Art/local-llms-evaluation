package org.jsoup.nodes;

public class GeneratedTestEqualsSameObject {

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
    public void testEqualsSameObject() {
        String originalText1 = "test";
        String originalText2 = "notsame";
        TextNode node1 = new TextNode(originalText1);
        TextNode node2 = node1; // same object
        boolean isEqual = equals(node1, node2);
        assertTrue(isEqual);
    }

    public static boolean equals(Object obj1, Object obj2) {
        if (obj1 == null && obj2 != null || obj1 != null && !obj1.equals(obj2)) {
            return false;
        }
        return true;
    }

}