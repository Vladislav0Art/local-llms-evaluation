package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectString {

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
    public void nodeName_ReturnsCorrectString() {
        // Arrange

        // Act and Assert
        TextNode textNode = new TextNode();
        textNode.setValue("");
        assertEquals("#text", textNode.nodeName());
    }

}