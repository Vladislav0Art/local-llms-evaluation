package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectionDefaultConnection {

    @Test
    public void connectionDefaultConnection() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = new Document("");
        assert document.connection() == connection;
    }

}