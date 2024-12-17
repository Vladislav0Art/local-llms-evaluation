package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private static String text = "Hello World";

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.setPrettyPrint(false);

        TextNode.TextNode headNode = TextNode.createFromEncoded("div {\n  text: 'Hello World'; }\n");
        headNode.setText();

        // Act
        document.open(appendable, "div", settings);
        appendable.append("\n");
        appendable.append(text);
        appendable.append("\n");
        appendable.close();
        appendable.clear();

        // Assert
        assertEquals("text: 'Hello World';\n", document.outerHtml().trim());
    }

}