package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.URL;
import java.net.Proxy;
import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        HttpConnection connection = new HttpConnection();
        InputStream inputStream = Mockito.mock(InputStream.class);
        connection.data("key", "filename", inputStream, "contentType");
    }

}