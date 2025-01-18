package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class GeneratedReferrerTest {

    @Test
    public void referrerTest() {
        String referrer = "http://www.example.com";
        Connection connection = new HttpConnection().referrer(referrer);
        assertNotNull(connection);
    }

}