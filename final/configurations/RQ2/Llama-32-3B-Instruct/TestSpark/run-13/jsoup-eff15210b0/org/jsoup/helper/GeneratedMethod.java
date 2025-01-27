package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedMethod {

    @Test
    public void method() {
        Method method = Connection.Method.GET;
        Connection conn = HttpConnection.method(method);
        assertNotNull(conn.request());
        assertEquals(method, conn.request().method());
    }

}