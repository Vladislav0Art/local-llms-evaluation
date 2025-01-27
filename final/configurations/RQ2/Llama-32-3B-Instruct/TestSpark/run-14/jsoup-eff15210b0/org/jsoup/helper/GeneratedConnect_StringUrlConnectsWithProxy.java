package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;

public class GeneratedConnect_StringUrlConnectsWithProxy {

    @Test
    public void connect_StringUrlConnectsWithProxy() throws IOException {
        Proxy proxy = new InetSocketAddressProxy("localhost", 8080);
        Connection connection = HttpConnection.connect("http://www.example.com", proxy);
        assertNotNull(connection);
    }

}