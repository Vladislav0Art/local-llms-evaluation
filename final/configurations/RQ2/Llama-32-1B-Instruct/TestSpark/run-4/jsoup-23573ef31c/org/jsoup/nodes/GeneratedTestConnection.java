package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestConnection {

    private Document document = new Document("");

    @Test
    public void testConnection() {
        Connection connection = mock(Connection.class);
        doReturn(connection).when(document.connection());
        Document result = document.connection();
        assertNotNull(result);
        verify(connection, times(1)).connection();
    }

}