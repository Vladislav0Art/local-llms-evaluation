package org.jsoup.nodes;

public class GeneratedTestGetNodeType {

    private static final String NAMESPACE = "com.example";

    @Test
    public void testGetNodeType() throws Exception {
        // Arrange
        String encoded = "{\"nodeType\":\"text\",\"children\":[{\"nodeType\":\"text\"}]}";
        Object node = Node.fromEncoded(encoded);

        // Act & Assert
        Assert.assertEquals("text", ((Node) node).getNodeType());
    }

}