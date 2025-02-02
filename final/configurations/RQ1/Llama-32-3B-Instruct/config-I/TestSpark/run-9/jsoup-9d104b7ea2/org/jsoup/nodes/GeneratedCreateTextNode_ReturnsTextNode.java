package org.jsoup.nodes;

public class GeneratedCreateTextNode_ReturnsTextNode {

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
    public void createTextNode_ReturnsTextNode() {
        // Arrange

        // Act and Assert
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setValue(text);
        assertEquals("Hello, World!", textNode.getValue());
    }

}