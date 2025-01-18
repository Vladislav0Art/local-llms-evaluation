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

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Connection connection = new HttpConnection();
        connection.data("key", "value");
        for (Connection.KeyVal keyVal : connection.request().data()) {
            if (keyVal.key().equals("key")) {
                assertEquals("value", keyVal.value());
            }
        }
    }

}