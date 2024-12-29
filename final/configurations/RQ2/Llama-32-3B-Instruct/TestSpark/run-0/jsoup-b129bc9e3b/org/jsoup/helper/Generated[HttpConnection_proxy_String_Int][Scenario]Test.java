package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_proxy_String_Int][Scenario]

Test {

    @Test
    public void [HttpConnection_proxy_String_Int][Scenario]Test() {
        String host = "example.com";
        int port = 8080;
        Connection conn = HttpConnection.proxy(host, port);
        assertNotNull(conn);
    }

}