package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        Connection result = httpConnection.data(data);
        Assert.assertNotNull(result);
    }

}