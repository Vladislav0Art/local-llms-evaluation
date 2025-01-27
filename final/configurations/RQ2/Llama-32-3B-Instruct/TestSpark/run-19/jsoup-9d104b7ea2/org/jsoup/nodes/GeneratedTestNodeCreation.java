package org.jsoup.nodes;

public class GeneratedTestNodeCreation {

    private static final String NAMESPACE = "com.example";

    @Test
    public void testNodeCreation() throws Exception {
        // Arrange
        String encoded = "{\"nodeType\":\"text\",\"children\":[{\"nodeType\":\"text\"}]}";
        Object node = Node.fromEncoded(encoded);

        // Act & Assert
        Assert.assertEquals(NAMESPACE + ".Node", node.getClass().getName());
    }

}