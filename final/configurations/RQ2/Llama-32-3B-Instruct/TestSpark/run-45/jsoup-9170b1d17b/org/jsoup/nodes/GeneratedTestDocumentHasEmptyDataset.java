package org.jsoup.nodes;

public class GeneratedTestDocumentHasEmptyDataset {

    @Test
    public void testDocumentHasEmptyDataset() {
        // Arrange
        Attributes attributes = new Attributes();
        Map<String, String> dataset = new HashMap<>();
        attributes.dataset().putAll(dataset);

        // Act
        assertEquals(0, ((Map) attributes.dataset()).size());
    }
}

}