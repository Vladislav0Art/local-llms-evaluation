package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedProxyWithProxyTest {

    @Test
    public void proxyWithProxyTest() {
        Proxy proxy = Proxy.NO_PROXY;
        Connection connection = new HttpConnection().proxy(proxy);
        assertNotNull(connection);
    }

}