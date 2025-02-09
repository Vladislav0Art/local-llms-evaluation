package org.jsoup.nodes;

public class GeneratedTestDocumentUpdateMetaCharsetElement {

    @Test
    public void testDocumentUpdateMetaCharsetElement() {
        // Arrange
        Charset charset = Charset.forName("utf-8");
        Document document = new Document();

        // Act
        document.setMetaCharset(charset);
        boolean result = document.updateMetaCharsetElement();

        // Assert
        assertTrue(result);
    }

}