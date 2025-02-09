package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedExecuteGetTest {

    @Test
    public void executeGetTest() throws Exception {
        HttpConnection conn = HttpConnection.connect("http://example.com");
        conn.method(Connection.Method.GET);
        Connection.Response response = conn.execute();
        assertTrue(response.statusCode() >= 200 && response.statusCode() < 400);
    }

}