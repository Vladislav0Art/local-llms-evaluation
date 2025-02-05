package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = new HttpConnection().data(data);
        assertNotNull(connection);
    }

}