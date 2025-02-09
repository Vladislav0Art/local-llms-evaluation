package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        int millis = 10000;
        Connection result = connection.timeout(millis);
        assertEquals(millis, result.request().timeout());
    }

}