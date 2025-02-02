package org.jsoup.nodes;

public class GeneratedOuterHtml_SetsCorrectHtml {

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
    public void outerHtml_SetsCorrectHtml() {
        // Arrange

        // Act and Assert
        String html = "<html><body>Hello</body></html>";
        when(TextNode.class, "getValue").thenReturn(html);
        TextNode textNode = new TextNode();
        assertEquals("<p>Hello</p>", textNode.outerHtml());
    }

}