package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataInputStreamTest {

    @Test
    public void dataInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream stream = new ByteArrayInputStream("test stream".getBytes());
        connection.data("key1", "test.txt", stream);
        assertEquals(1, connection.request().data().size());
    }

}