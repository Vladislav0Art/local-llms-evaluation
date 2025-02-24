package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestLocation {

    @Test
    public void testLocation() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.location()).thenReturn("http://example.com");

        // Act
        String location = document.location();

        // Assert
        assertEquals("http://example.com", location);
    }

}