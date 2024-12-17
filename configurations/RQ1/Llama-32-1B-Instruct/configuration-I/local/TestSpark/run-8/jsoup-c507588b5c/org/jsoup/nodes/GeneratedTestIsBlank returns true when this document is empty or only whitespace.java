package org.jsoup.nodes;

public class GeneratedTestIsBlank returns true when this
document is
empty or
only whitespace {

@Test
public void testIsBlank
returns true when this
document is
empty or

only whitespace() {
    // Arrange
    Document doc = new Document();
    Appendable emptyString = StringUtil.emptyApplicable(doc);
    Document.OutputSettings out = new Document.OutputSettings();

    // Act
    boolean result = TextNode.isBlank(emptyString, out);

    // Assert
    assertTrue(result);
}

}