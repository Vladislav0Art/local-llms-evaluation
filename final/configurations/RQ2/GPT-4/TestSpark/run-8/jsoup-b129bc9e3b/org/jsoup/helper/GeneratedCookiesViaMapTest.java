package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookiesViaMapTest {

    @Test
    public void cookiesViaMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> testCookies = new HashMap<>();
        testCookies.put("key1", "value1");
        testCookies.put("key2", "value2");
        Connection connection = httpConnection.cookies(testCookies);
        Assert.assertNotNull(connection);
    }

}