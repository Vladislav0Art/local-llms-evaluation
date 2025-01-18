package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws Exception {
        URL url = new URL("https://jsoup.org/");
        HttpConnection connection = new HttpConnection();
        connection.url(url);

        assertEquals(url, connection.request().url());
    }

}