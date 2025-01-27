package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class GeneratedProxy_StringConstructsProxy {

    @Test
    public void proxy_StringConstructsProxy() throws IOException {
        Proxy proxy = new InetSocketAddressProxy("localhost", 8080);
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
    }

}