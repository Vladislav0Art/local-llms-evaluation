package org.jsoup.nodes;

public class GeneratedTestSplitText returns original text after offset if
no parent
is present {

@Test
public void testSplitText
returns original
text after
offset if
no parent

is present() {
    // Arrange
    Document doc = new Document();
    Appendable string1 = "Hello";
    Document.OutputSettings out = new Document.OutputSettings();

    // Act
    TextNode result = TextNode.splitText(0, out);

    // Assert
    assertEquals("Hello", result.text());
}

}