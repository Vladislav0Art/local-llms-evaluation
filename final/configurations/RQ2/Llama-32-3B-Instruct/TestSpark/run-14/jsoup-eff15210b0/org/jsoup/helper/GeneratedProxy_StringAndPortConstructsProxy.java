package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class GeneratedProxy_StringAndPortConstructsProxy {

    @Test
    public void proxy_StringAndPortConstructsProxy() throws IOException {
        String host = "localhost";
        int port = 8080;
        Connection connection = HttpConnection.proxy(host, port);
        assertNotNull(connection);
    }

}