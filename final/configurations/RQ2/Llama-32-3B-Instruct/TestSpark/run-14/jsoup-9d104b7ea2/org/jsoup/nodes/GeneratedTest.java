package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public void setText(String value) {
        this.value = value;
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

    public static void createFromEncoded(String encoded, Element parent) {
        // implementation of createFromEncoded method
    }
}

public class GeneratedTest {

    @Test
    public void testNodeName() {
        // Arrange & Act
        String text = "Test Node";
        TextNode node = new TextNode(text);

        // Assert
        assertEquals("text", node.nodeName());
    }

    @Test
    public void testText() {
        // Arrange & Act
        TextNode node = new TextNode("");
        node.text("Hello World");

        // Assert
        assertEquals("Hello World", node.text());
    }

    @Test
    public void normaliseWhitespace() {
        // Arrange & Act
        String text = "   Test Node  ";
        String expectedText = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals(expectedText, "");
    }

    @Test
    public void stripLeadingWhitespace() {
        // Arrange & Act
        String text = "   Test Node  ";
        String expectedText = TextNode.stripLeadingWhitespace(text);

        // Assert
        assertEquals("Test Node", expectedText);
    }

    @Test
    public void isBlank() {
        // Arrange & Act
        TextNode node = new TextNode("");
        boolean result = node.isBlank();

        // Assert
        assertTrue(result);
    }

}