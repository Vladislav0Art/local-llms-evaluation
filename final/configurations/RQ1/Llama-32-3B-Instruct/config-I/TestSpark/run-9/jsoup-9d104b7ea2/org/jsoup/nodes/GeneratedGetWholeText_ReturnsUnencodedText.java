package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsUnencodedText {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class Document {
    public static class OutputSettings {
        public OutputSettings(boolean noWrap, boolean prettyPrint) {
        }
    }

    public static class GeneratedTest {

    }
}

public class TextNodeTest {

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        // Arrange

        // Act and Assert
        String originalText = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setValue(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

}