package org.jsoup.nodes;

public class GeneratedTestNodeFromNullEncoded {

    private static final String NAMESPACE = "com.example";

    @Test
    public void testNodeFromNullEncoded() throws Exception {
        // Arrange
        String encoded = null;
        Object node = Node.fromEncoded(encoded);

        // Act & Assert
        Assert.assertNull(node);
    }

}