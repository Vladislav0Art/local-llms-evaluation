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

public class GeneratedUrlWithNullTest {

    @Test
    public void urlWithNullTest() {
        HttpConnection connection = new HttpConnection();
        connection.url((URL) null);
    }

}