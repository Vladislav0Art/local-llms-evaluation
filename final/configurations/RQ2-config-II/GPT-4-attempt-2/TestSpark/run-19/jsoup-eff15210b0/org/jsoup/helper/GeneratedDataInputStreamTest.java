package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataInputStreamTest {

    @Test
    public void dataInputStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream is = new ByteArrayInputStream("test-file-content".getBytes());
        Connection connection = httpConnection.data("key", "filename", is);
        assertEquals("filename", connection.request().data().get(0).key());
    }

}