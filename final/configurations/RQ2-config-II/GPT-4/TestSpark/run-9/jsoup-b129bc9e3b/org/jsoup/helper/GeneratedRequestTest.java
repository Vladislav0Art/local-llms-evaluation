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

public class GeneratedRequestTest {

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertTrue(httpConnection.request() instanceof Connection.Request);
    }

}