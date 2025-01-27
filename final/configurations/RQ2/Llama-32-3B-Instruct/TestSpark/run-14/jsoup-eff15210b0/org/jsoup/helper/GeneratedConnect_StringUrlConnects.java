package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;

public class GeneratedConnect_StringUrlConnects {

    @Test
    public void connect_StringUrlConnects() throws IOException {
        Connection connection = HttpConnection.connect("http://www.example.com");
        assertNotNull(connection);
    }

}