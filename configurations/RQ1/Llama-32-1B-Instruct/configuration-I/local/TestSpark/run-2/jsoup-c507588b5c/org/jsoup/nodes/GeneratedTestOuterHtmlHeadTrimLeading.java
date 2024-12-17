package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHeadTrimLeading {

    private static String text = "Hello World";

    @Test
    public void testOuterHtmlHeadTrimLeading() {
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
        appendable = document.append(headNode.getWholeText());

        // Assert
        assertEquals("Hello World\n", appendable.toString().trim());
    }

}