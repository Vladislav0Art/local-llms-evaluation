package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedProxyStringHostPort {

    @Test
    public void proxyStringHostPort() {
        String host = "host";
        int port = 8080;
        Connection conn = HttpConnection.proxy(host, port);
        assertNull(conn.request());
    }

}