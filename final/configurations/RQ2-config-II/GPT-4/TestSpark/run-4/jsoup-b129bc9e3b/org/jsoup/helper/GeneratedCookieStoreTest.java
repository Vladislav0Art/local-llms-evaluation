package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookieStoreTest {

    @Test
    public void cookieStoreTest() {
        HttpConnection connection = new HttpConnection();
        CookieStore cookieStore = new CookieStore();
        Connection newConnection = connection.cookieStore(cookieStore);
        Assertions.assertNotNull(newConnection);
    }

}