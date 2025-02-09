package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();

        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");

        httpConnection.data(data);

        assertEquals("value1", httpConnection.request().data().get(0).value());
        assertEquals("value2", httpConnection.request().data().get(1).value());
    }

}