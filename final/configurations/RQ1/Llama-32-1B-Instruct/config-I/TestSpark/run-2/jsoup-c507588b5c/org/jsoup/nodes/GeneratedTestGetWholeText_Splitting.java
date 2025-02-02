package org.jsoup.nodes;

public class GeneratedTestGetWholeText_Splitting {

    @Test
    public void testGetWholeText_Splitting() {
        // Arrange
        String text = "Hello   World";

        // Act
        String wholeText = nodeGetWholeText();

        // Assert
        assertEquals("Hello World", wholeText, "nodeGetWholeText() returned unexpected result");
    }

}