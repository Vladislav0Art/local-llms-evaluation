package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestConnection {

    private Document document;

    @Test
    public void testConnection() {
        document = new Document("http://example.com");
        Connection connection = Jsoup.connect("http://example.com");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}