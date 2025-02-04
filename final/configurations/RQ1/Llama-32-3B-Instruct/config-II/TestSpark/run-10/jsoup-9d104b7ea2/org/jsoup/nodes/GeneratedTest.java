package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void [TextNodeConstructor]

    ShouldCreateNewTextNodeWithGivenText() {
        // Arrange
        String expectedText = "Hello World";

        // Act
        TextNode textNode = new TextNode(expectedText);

        // Assert
        assertEquals(expectedText, textNode.text());
    }

    @Test
    public void [TextNodeGetWholeText]

    ShouldReturnUnencodedTextIncludingNewlinesAndSpaces() {
        // Arrange
        String expectedText = "Hello World";

        // Act
        TextNode textNode = new TextNode(expectedText);
        String actualText = textNode.getWholeText();

        // Assert
        assertEquals(expectedText, actualText);
    }

    @Test
    public void [TextNodeIsBlank]

    ShouldReturnTrueWhenTextNodeIsEmptyOrOnlyWhitespace() {
        // Arrange
        String expectedText = "";
        TextNode textNode = new TextNode(expectedText);

        // Act
        boolean actualResult = textNode.isBlank();

        // Assert
        assertTrue(actualResult);
    }

    @Test
    public void [TextNodeSplitText]

    ShouldCreateNewTextNodeWithGivenOffset() {
        // Arrange
        String expectedTextAfterOffset = "World";
        TextNode expectedTextNodeAfterOffset = new TextNode(expectedTextAfterOffset);

        // Act
        TextNode textNode = new TextNode("Hello World");
        TextNode actualTextNode = textNode.splitText(5);

        // Assert
        assertEquals(expectedTextNodeAfterOffset, actualTextNode);
    }

    @Test
    public void [TextNodeSplitTextWithInvalidOffset]

    ShouldThrowInvalidArgumentException() {
        // Arrange

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new TextNode("Hello World").splitText(-1));
    }

    @Test
    public void [TextNodeOuterHtmlHead]

    ShouldNotIndentWhenTextNodeIsBlankAndNextSiblingIsElementOrTextNode() {
        // Arrange
        String expectedText = "   ";
        Appendable expectedAccumulatedText = new StringBuilder(expectedText);
        Document.OutputSettings outSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");

        // Act
        Appendable accumulatedText = new StringBuilder();
        int depth = 0;
        document.outputHtmlHead(accumulatedText, depth, outSettings, textNode);

        // Assert
        assertTrue(accumulatedText.toString().equals(expectedText));
    }

    @Test
    public void [TextNodeOuterHtmlTail]

    ShouldNotDoAnything() {
        // Arrange

        // Act and Assert
        Appendable accumulatedText = new StringBuilder();
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accumulatedText, depth, outSettings);
        assertEquals("", accumulatedText.toString());
    }

    @Test
    public void [TextNodeClone]

    ShouldReturnNewTextNodeWithSameContent() {
        // Arrange
        String expectedText = "Hello World";
        TextNode textNode = new TextNode(expectedText);

        // Act
        TextNode actualNode = textNode.clone();

        // Assert
        assertEquals(expectedText, actualNode.text());
    }

    @Test
    public void [TextNodeCreateFromEncoded]

    ShouldReturnTextNodeWithUnencodedData() {
        // Arrange
        String expectedEncodedText = "&lt;Hello World&gt;";
        String expectedUnencodedText = "Hello World";

        // Act
        TextNode textNode = TextNode.createFromEncoded(expectedEncodedText);

        // Assert
        assertEquals(expectedUnencodedText, textNode.text());
    }

}