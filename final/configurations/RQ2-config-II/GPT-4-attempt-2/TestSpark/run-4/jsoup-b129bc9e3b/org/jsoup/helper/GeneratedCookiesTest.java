package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookies(Collections.singletonMap("cookieName", "cookieValue"));
        Assert.assertNotNull(httpConnection.request().cookies());
        Assert.assertTrue(httpConnection.request().cookies().containsKey("cookieName"));
    }

}