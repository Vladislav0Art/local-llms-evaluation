package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDataWithMapTest {

    @Test
    public void dataWithMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key1", "value1");
        dataMap.put("key2", "value2");
        assertTrue(connection.data(dataMap) instanceof HttpConnection);
    }

}