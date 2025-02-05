package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://invalidurl.com").get();
    }

}