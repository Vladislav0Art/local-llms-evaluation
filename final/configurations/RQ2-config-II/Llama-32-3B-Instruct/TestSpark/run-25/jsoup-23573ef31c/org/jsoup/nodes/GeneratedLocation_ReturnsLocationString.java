package org.jsoup.nodes;

public class GeneratedLocation_ReturnsLocationString {

    @Test
    public void location_ReturnsLocationString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String location = document.location();

        // Assert
        assertThat(location, is("https://example.com"));
    }

}