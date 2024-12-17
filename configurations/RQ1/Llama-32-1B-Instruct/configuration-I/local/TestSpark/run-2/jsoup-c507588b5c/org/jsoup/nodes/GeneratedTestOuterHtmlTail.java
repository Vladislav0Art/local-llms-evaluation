package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private static String text = "Hello World";

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);
        Document.OutputSettings settings = new Document.OutputSettings();

        TextNode.TextNode tailNode = TextNode.createFromEncoded("div {\n  text: 'Hello World'; }\n");
        tailNode.setText();

        // Act
        document.open(appendable, "div", settings);
        appendable.append("\n");
        appendable.append(text);
        appendable.append("\n");
        appendable.close();
        appendable.clear();
        appendable = document.append(tailNode.getWholeText());

        // Assert
        assertEquals("text: 'Hello World';\n", appendable.toString().trim());
    }

}