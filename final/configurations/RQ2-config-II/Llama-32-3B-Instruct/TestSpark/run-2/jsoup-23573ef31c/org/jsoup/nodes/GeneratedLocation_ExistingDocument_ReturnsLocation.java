package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLocation_ExistingDocument_ReturnsLocation {

    @Test
    public void location_ExistingDocument_ReturnsLocation() {
        // Arrange
        Document document = new Document("http://example.com");
        when(document.location()).thenReturn("http://example.com");

        // Act & Assert
        assertEquals("http://example.com", document.location());
    }

}