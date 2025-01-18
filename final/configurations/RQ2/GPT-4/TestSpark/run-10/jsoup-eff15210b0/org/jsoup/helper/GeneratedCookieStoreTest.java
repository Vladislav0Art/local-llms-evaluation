package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookieStoreTest {

    @Test
    public void cookieStoreTest() {
        Connection connection = new HttpConnection();
        CookieStore expectedCookieStore = new CookieManager().getCookieStore();
        connection.cookieStore(expectedCookieStore);
        CookieStore actualCookieStore = connection.request().cookieStore();
        Assert.assertEquals(expectedCookieStore, actualCookieStore);
    }

}