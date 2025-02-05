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

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        httpConnection.data(map);
        Connection.KeyVal data = httpConnection.data("key");
        assertEquals("key", data.key());
        assertEquals("value", data.value());
    }

}