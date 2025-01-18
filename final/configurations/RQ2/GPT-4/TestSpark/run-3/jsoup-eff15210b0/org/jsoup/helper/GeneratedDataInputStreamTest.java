package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDataInputStreamTest {

    @Test
    public void dataInputStreamTest() throws IOException {
        Connection connection = new HttpConnection();
        InputStream stream = new ByteArrayInputStream("test".getBytes());
        connection.data("key", "fname", stream);

        for (Connection.KeyVal keyVal : connection.request().data()) {
            if (keyVal.key().equals("key")) {
                assertTrue(keyVal.hasInputStream());
            }
        }
    }

}