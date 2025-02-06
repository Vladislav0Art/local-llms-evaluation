package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLocation_NewDocument_ReturnsNull {

    @Test
    public void location_NewDocument_ReturnsNull() {
        // Arrange
        Document document = new Document(null);

        // Act & Assert
        assertNull(document.location());
    }

}