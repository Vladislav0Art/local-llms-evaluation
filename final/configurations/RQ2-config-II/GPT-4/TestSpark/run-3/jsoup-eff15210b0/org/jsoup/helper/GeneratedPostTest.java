package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.internal.ConstrainableInputStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        Connection connection = HttpConnection.connect("https://httpbin.org/post");
        Document doc = connection
                .data("name", "Ross")
                .post();
        assertEquals("Ross", doc.body().text());
    }

}