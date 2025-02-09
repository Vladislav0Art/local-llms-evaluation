package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCookieStoreTest {

    @Test
    public void cookieStoreTest() {
        HttpConnection httpConnection = new HttpConnection();
        CookieStore cookieStore = new CookieManager().getCookieStore();
        Connection connection = httpConnection.cookieStore(cookieStore);
        assertNotNull(connection);
        assertEquals(cookieStore, httpConnection.cookieStore());
    }

}