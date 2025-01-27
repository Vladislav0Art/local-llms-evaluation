package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedConnection_ReturnsNonNullConnection {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void connection_ReturnsNonNullConnection() {
        Document document = new Document();
        Connection connection = document.connection();
        assertNotNull(connection);
        assertEquals(connectionMock, connection);
    }

}