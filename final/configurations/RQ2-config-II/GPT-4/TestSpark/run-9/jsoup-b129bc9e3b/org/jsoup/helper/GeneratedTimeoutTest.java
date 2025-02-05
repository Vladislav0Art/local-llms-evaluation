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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.timeout(1000);
        assertEquals(1000, httpConnection.request().timeout());
    }

}