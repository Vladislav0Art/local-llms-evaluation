package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDataInputStreamTest {

    @Test
    public void dataInputStreamTest() {
        InputStream stream = new ByteArrayInputStream("test".getBytes());
        HttpConnection connection = new HttpConnection();
        connection.data("key", "filename.ext", stream);

        assertNotNull(connection.request().data());
    }

}