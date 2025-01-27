package org.jsoup.nodes;

public class GeneratedTest {

    private String text;
    public static final String NODE_NAME = "text";

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public void text(String text) {
        this.text = text;
    }

    public String getWholeText() {
        return text;
    }

    public boolean isBlank() {
        return StringUtil.stripLeadingWhitespace(text).isEmpty();
    }

    public TextNode splitText(int index) {
        // implement splitting logic here
        return new TextNode(text.substring(0, index));
    }
}

public class StringUtil {

    public static String stripLeadingWhitespace(String input) {
        if (input.isEmpty()) {
            return input;
        }
        while (!Character.isLetterOrDigit(input.charAt(0))) {
            input = input.substring(1);
        }
        return input;
    }

    public static boolean lastCharIsWhitespace(StringBuilder builder) {
        if (builder.length() == 0) {
            return true;
        }
        char lastChar = builder.charAt(builder.length() - 1);
        return Character.isWhitespace(lastChar);
    }
}

public class GeneratedTest {

    @Test
    public void textNodeCreatesWithText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void textNodeCreatesWithNullText() {
        TextNode node = new TextNode(null);
        assertEquals("", node.text());
    }

    @Test
    public void nodeNameIsText() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void textIsAccessible() {
        TextNode node = new TextNode("Hello");
        String result = node.text();
        assertTrue(result.equals("Hello"));
    }

    @Test
    public void setTextNodeUpdatesText() {
        TextNode node = new TextNode("Hello");
        node.text("World");
        assertEquals("World", node.text());
    }

    @Test
    public void getWholeTextReturnsOriginalString() {
        TextNode node = new TextNode("Hello");
        String result = node.getWholeText();
        assertTrue(result.equals("Hello"));
    }

    @Test
    public void isBlankReturnsFalseWhenTextIsNotEmpty() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlankReturnsTrueWhenTextIsEmpty() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextUpdatesTextNodeWithRemovedText() {
        TextNode node = new TextNode("HelloWorld");
        node.text("World");
        String result = node.splitText(5).text();
        assertEquals("Hello", result);
    }

    @Test
    public void toStringReturnsTextOnly() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.toString());
    }

    @Test
    public void cloneCreatesNewTextNodeWithSameText() {
        TextNode node = new TextNode("Hello");
        TextNode clone = node.clone();
        assertEquals(node, clone);
    }

    @Test
    public void createFromEncodedReturnsTextNodeWithEncodedText() {
        TextNode node = TextNode.createFromEncoded("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void normaliseWhitespaceReplacesMultipleSpacesWithSingleSpace() {
        String result = StringUtil.normaliseWhitespace("   ");
        assertTrue(result.equals(" "));
    }

}