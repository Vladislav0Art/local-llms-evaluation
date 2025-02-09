package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataWithMapTest {

    @Test
    public void dataWithMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = httpConnection.data(data);
        assertNotNull(connection);
    }

}