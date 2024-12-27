package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.Collection;

import static org.junit.Assert.*;

public class GeneratedProxyParameterTest {

    @Test
    public void proxyParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = Proxy.NO_PROXY;
        assertEquals(httpConnection, httpConnection.proxy(proxy));
    }

}