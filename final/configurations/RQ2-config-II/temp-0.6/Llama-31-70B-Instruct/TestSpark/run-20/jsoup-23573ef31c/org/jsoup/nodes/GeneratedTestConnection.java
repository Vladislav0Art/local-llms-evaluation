package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.connection()).thenReturn(null);

        // Act
        Connection connection = document.connection();

        // Assert
        assertNull(connection);
    }

}