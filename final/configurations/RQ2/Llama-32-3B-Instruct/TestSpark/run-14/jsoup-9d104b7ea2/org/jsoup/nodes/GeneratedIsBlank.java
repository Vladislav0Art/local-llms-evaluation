package org.jsoup.nodes;

public class GeneratedIsBlank {

    private String value;

    public TextNode() {
    }

    public void setText(String text) {
        this.value = text;
    }

    public static String normaliseWhitespace(String text) {
        return text.trim();
    }

    public static String stripLeadingWhitespace(String text) {
        while (text.startsWith(" ")) {
            text = text.substring(1);
        }
        return text;
    }

    public boolean isBlank() {
        return value.isEmpty();
    }

    public String nodeName() {
        return "text";
    }

    public void createFromEncoded(String encoded, Element parent) {
        // implementation of createFromEncoded method
    }
}

public class GeneratedTest {

    @Test
    public void isBlank() {
        TextNode node = new TextNode();
        assertTrue(node.isBlank());
    }

}