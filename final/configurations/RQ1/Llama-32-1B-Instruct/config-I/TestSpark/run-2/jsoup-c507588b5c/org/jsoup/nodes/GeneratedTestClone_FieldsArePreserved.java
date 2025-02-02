package org.jsoup.nodes;

public class GeneratedTestClone_FieldsArePreserved {

    @Test
    public void testClone_FieldsArePreserved() {
        // Arrange
        String text1 = "Hello";
        String text2 = " World";

        TextNode node1 = createFromEncoded(text1);
        TextNode node2 = node1.clone();

        // Act
        node2.setText(text2);

        // Assert
        assertEquals(text1, node1.getText(), "nodeGetWholeText() returned unexpected result");
    }

}