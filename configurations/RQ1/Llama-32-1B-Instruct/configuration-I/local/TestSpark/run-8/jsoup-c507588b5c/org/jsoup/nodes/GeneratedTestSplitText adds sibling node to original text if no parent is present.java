package org.jsoup.nodes;

public class GeneratedTestSplitText adds sibling node to original text if
no parent
is present {

@Test
public void testSplitText
adds sibling
node to
original text if
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