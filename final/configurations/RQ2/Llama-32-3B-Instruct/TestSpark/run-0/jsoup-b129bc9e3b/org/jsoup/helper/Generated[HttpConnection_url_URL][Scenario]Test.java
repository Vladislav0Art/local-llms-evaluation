package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_url_URL][Scenario]

Test {

    @Test
    public void [HttpConnection_url_URL][Scenario]Test() {
        URL url = new URL("http://example.com");
        Connection conn = HttpConnection.url(url);
        assertNotNull(conn);
    }

}