package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        Connection connection = new HttpConnection();
        connection.timeout(5000);
        assertEquals(5000, connection.request().timeout());
    }

}