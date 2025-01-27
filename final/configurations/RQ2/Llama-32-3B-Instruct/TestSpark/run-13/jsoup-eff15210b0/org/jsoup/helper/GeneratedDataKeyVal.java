package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedDataKeyVal {

    @Test
    public void dataKeyVal() {
        String key = "key";
        String value = "value";
        Connection conn = HttpConnection.data(key, value);
        assertNotNull(conn.request());
        assertEquals(key, conn.request().data().get(Connection.KeyVal.KEY).getKey());
        assertEquals(value, conn.request().data().get(Connection.KeyVal.VALUE).getValue());
    }

}