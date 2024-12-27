package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.IOException;
import java.util.Map;

public class GeneratedConnectConnect_String_ReturnsHttpConnection {

    @Test
    public void connectConnect_String_ReturnsHttpConnection() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertNotNull(connection);
        assertEquals(HttpConnection.class, connection.getClass());
    }

}