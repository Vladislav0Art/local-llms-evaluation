package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedSetUserAgentTest {

    @Test
    public void setUserAgentTest() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
        assertEquals("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36", connection.getUserAgent());
    }

}