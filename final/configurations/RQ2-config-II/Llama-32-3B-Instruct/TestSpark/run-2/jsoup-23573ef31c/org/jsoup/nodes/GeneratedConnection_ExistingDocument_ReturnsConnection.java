package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnection_ExistingDocument_ReturnsConnection {

    @Test
    public void connection_ExistingDocument_ReturnsConnection() {
        // Arrange
        Document document = new Document("http://example.com");
        Connection connection = Mockito.mock(Connection.class);
        when(document.connection()).thenReturn(connection);

        // Act & Assert
        assertEquals(connection, document.connection());
    }

}