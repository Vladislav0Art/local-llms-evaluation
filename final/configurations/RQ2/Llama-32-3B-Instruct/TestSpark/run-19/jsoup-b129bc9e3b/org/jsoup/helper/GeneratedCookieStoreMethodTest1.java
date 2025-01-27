package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedCookieStoreMethodTest1 {

    @Test
    public void cookieStoreMethodTest1() {
        CookieStore cookieStore = new CookieStore();
        Connection connection = HttpConnection.connect(new URL("http://localhost"));
        connection.cookieStore(cookieStore);
        assertNotNull(connection.cookieStore());
    }

}