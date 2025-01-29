package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestConnectCookieStore {

    @Test
    public void testConnectCookieStore() {
        CookieStore cookieStore = new org.jsoup.parser.Parser().parse(new java.net.InetSocketAddress());
        HttpConnection connection = new HttpConnection(cookieStore);
        assertNotNull(connection.cookieStore());
    }

}