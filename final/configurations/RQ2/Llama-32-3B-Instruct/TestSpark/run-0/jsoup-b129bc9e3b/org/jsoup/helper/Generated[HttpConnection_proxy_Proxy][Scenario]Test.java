package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_proxy_Proxy][Scenario]

Test {

    @Test
    public void [HttpConnection_proxy_Proxy][Scenario]Test() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080));
        Connection conn = HttpConnection.proxy(proxy);
        assertNotNull(conn);
    }

}