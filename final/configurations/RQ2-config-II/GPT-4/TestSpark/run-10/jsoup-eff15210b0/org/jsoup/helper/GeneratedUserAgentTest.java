package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla");
        assertEquals("Mozilla", connection.userAgent());
    }

}