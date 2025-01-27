package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConnectionReturnsCorrectConnection {

    @Test
    public void connectionReturnsCorrectConnection() {
        Connection connection = new Connection();
        Document document = new Document("http://example.com");
        Document result = document.connection(connection);
        assertNotNull(result);
        assertEquals(connection, result.connection());
    }

}