package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsCorrectBoolean {

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
    public void isBlank_ReturnsCorrectBoolean() {
        // Arrange

        // Act and Assert
        boolean result = true;
        TextNode textNode = new TextNode();
        textNode.setValue("");
        assertEquals(result, textNode.isBlank());

        result = false;
        textNode = new TextNode();
        textNode.setValue("Hello");
        assertEquals(false, textNode.isBlank());
    }

}