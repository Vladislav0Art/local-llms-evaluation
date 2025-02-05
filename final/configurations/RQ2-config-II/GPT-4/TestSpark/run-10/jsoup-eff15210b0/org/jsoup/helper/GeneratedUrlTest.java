package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("http://google.com");
        assertNotNull(connection.url());
    }

}