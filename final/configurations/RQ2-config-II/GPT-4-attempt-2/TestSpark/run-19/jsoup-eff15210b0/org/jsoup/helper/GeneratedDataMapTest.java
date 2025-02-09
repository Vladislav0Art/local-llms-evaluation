package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = httpConnection.data(data);
        assertEquals("value", connection.request().data().get(0).value());
    }

}