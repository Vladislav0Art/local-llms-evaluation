package org.jsoup.nodes;

public class GeneratedTestDocumentEqualsSameAttributes {

    @Test
    public void testDocumentEqualsSameAttributes() {
        // Arrange
        Attributes original = new Attributes();
        Attributes cloned = new Attributes(original);

        // Act
        assertNotSame(original, cloned);

        // Assert
        assertEquals(1, cloned.size());
        assertTrue(cloned.hasKey("key"));
        assertEquals("value", cloned.get("key"));
    }

}