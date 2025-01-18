package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedMaxBodySizeTest {

    private static final String TEST_URL_STRING = "http://localhost";
    private static final String TEST_KEY = "test_key";
    private static final String TEST_VALUE = "test_value";
    private static final int TEST_TIMEOUT = 5000;
    private static final SSLSocketFactory TEST_SSL_SOCKET_FACTORY = (SSLSocketFactory) SSLSocketFactory.getDefault();

    @Test
    public void maxBodySizeTest() {
        Connection connection = new HttpConnection();
        connection.maxBodySize(1024);
    }

}