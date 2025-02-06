package org.jsoup.nodes;

public class GeneratedConnection_ReturnsConnectionObject {

    @Test
    public void connection_ReturnsConnectionObject() {
        // Arrange
        Connection connection = Jsoup.connect("https://example.com");
        Document document = new Document(connection);

        // Act
        Connection actual = document.connection();

        // Assert
        assertThat(actual, is(connection));
    }

}