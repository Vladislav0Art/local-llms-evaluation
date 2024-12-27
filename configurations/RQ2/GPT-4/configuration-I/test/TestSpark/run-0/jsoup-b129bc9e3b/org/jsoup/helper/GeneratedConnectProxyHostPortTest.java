package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConnectProxyHostPortTest {

    @Test
    public void connectProxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.proxy("localhost", 8080);
        assertNotNull(connectionResult);
    }

}