package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataWithMapTest {

    @Test
    public void dataWithMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = new HttpConnection().data(data);
        assertNotNull(connection);
    }

}