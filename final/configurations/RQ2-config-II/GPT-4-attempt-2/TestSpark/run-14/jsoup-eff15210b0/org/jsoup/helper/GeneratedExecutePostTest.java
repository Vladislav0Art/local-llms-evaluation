package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedExecutePostTest {

    @Test
    public void executePostTest() throws Exception {
        HttpConnection conn = HttpConnection.connect("http://example.com");
        conn.method(Connection.Method.POST);
        conn.execute();
    }

}