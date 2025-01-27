package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedDataMap {

    @Test
    public void dataMap() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection conn = HttpConnection.data(data);
        assertNotNull(conn.request());
        assertEquals(1, data.size());
    }

}