package org.jsoup.nodes;

public class GeneratedCreateShellWithInvalidBaseUri_ThrowsNullPointerException {

    @Test
    public void createShellWithInvalidBaseUri_ThrowsNullPointerException() {
        // Arrange
        String baseUri = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Document.createShell(baseUri));
    }

}