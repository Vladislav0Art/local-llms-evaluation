package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class GeneratedDataWithInputStreamTest {

    @Test
    public void dataWithInputStreamTest() {
        InputStream inputStream = new ByteArrayInputStream("test input stream".getBytes(StandardCharsets.UTF_8));
        Connection connection = new HttpConnection().data("key", "filename", inputStream);
        assertNotNull(connection);
    }

}