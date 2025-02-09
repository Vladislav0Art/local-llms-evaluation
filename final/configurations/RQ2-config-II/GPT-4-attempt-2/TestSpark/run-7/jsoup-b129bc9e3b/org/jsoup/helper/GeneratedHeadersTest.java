package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        Map<String, String> mapHeaders = new HashMap<>();
        mapHeaders.put("key1", "value1");
        mapHeaders.put("key2", "value2");
        Assert.assertNotNull(new HttpConnection().headers(mapHeaders));
    }

}