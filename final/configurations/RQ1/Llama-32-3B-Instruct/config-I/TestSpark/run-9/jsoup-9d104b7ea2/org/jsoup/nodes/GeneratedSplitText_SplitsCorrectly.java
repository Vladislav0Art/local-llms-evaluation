package org.jsoup.nodes;

public class GeneratedSplitText_SplitsCorrectly {

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
    public void splitText_SplitsCorrectly() {
        // Arrange

        // Act and Assert
        String originalText = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode();
        textNode.setValue(originalText);

        TextNode expectedText = new TextNode();
        expectedText.setValue("World");
        when(textNode.getValue()).thenReturn(originalText.substring(0, offset));
        assertEquals(expectedText, textNode.splitText(offset).text());
    }

}