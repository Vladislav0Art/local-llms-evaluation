package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection con = new HttpConnection();
        Proxy proxy = mock(Proxy.class);
        Connection returnedCon = con.proxy(proxy);
        assertNotNull(returnedCon);
    }

}