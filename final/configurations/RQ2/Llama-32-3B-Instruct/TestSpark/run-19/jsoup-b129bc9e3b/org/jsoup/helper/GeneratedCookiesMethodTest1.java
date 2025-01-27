package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedCookiesMethodTest1 {

    @Test
    public void cookiesMethodTest1() {
        Map<String, String> cookies = new HashMap<>();
        cookies.put("key", "value");
        Connection.Request request = new Request();
        request.cookies(cookies);
        assertNotNull(request);
    }
}

}