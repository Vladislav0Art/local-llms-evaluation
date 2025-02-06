package org.jsoup.nodes;

public class GeneratedCreateShellWithValidBaseUri_ReturnsDocument {

    @Test
    public void createShellWithValidBaseUri_ReturnsDocument() {
        // Arrange
        String baseUri = "https://example.com";
        Document expected = new Document(baseUri);

        // Act
        Document actual = Document.createShell(baseUri);

        // Assert
        assertThat(actual, is(expected));
    }

}