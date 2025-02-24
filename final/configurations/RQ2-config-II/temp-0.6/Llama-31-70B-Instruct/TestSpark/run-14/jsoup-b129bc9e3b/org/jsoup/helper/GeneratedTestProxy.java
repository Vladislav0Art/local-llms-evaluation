package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.KeyVal;
import org.jsoup.internal.ConstrainableInputStream;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestProxy {

    private HttpConnection connection;

    @Before
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testProxy() {
        Proxy proxy = mock(Proxy.class);
        HttpConnection connection = connection.proxy(proxy);
        assertNotNull(connection);
    }

}