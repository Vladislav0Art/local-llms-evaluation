package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceTest {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implementation of fromEncoded method
        return new TextNode(encodedText);
    }

    public void text(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public String nodeName() {
        return "text";
    }

    public String getWholeText() {
        return text;
    }

    public static boolean isBlank(String text) {
        // implementation of isBlank method
        return text.trim().isEmpty();
    }

    public static TextNode splitText(int offset) {
        // implementation of splitText method
        return new TextNode(text.substring(offset));
    }

    public TextNode clone() {
        return new TextNode(text);
    }

    public boolean lastCharIsWhitespace(StringBuilder sb) {
        if (sb.length() > 0 && Character.isWhitespace(text.charAt(sb.length() - 1))) {
            return true;
        }
        return false;
    }

    public static String normaliseWhitespace(String text) {
        // implementation of normaliseWhitespace method
        return text.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String text) {
        // implementation of stripLeadingWhitespace method
        if (text.isEmpty()) {
            return "";
        } else {
            while (text.startsWith(" ")) {
                text = text.substring(1);
            }
            return text;
        }
    }
}

public class GeneratedTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Hello ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}