package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCookieStoreTest {

    @Test
    public void cookieStoreTest() {
        HttpConnection httpConnection = new HttpConnection();
        CookieStore cookieStore = Mockito.mock(CookieStore.class);
        Connection connection = httpConnection.cookieStore(cookieStore);
        assertEquals(connection.request().cookieStore(), cookieStore);
    }

}