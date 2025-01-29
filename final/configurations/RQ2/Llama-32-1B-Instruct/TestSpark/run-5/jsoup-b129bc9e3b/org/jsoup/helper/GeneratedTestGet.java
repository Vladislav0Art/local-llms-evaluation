package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGet {

    private String url = "http://example.com";
    private int timeoutMs = 1000;

    @Test
    public void testGet() throws IOException {
        HttpConnection connection = new HttpConnection();
        when(connection.get()).thenReturn(new Document());
        Document document = connection.get();
        assertEquals("", document.toString());
    }

}