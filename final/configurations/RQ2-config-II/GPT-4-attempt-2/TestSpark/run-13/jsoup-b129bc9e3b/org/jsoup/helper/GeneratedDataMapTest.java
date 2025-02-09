package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = new HttpConnection();
        connection.data(data);
        assertEquals("value", connection.request().data().get(0).value());
    }

}