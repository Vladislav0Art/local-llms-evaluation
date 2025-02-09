package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedConnectWithURLObjectTest {

    @Test
    public void connectWithURLObjectTest() throws Exception {
        Connection conn = HttpConnection.connect(new URL("https://www.google.com"));
        assertNotNull(conn);
    }

}