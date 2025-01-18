package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        Proxy proxy = Mockito.mock(Proxy.class);
        HttpConnection connection = new HttpConnection();
        connection.proxy(proxy);

        assertEquals(proxy, connection.request().proxy());
    }

}