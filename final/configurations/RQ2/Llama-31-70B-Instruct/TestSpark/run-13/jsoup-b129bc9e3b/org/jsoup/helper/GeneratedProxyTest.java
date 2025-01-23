package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

}