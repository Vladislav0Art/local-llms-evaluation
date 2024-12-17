package org.jsoup.nodes;

public class GeneratedTestIsBlank returns false
when it
contains any
text content {

@Test
public void testIsBlank
returns false
when it
contains any

text content() {
    // Arrange
    Document doc = new Document();
    Appendable text1 = "Hello";
    Appendable text2 = "\n\nWorld!";
    Document.OutputSettings out = new Document.OutputSettings();

    // Act
    boolean result = TextNode.isBlank(text1, out);
    result &= TextNode.isBlank(text2, out);

    // Assert
    assertFalse(result);
}

}