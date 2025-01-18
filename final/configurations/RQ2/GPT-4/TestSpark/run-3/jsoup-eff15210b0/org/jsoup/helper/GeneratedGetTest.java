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

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document doc = connection.get();
        assertTrue(doc.title().contains("Example Domain"));
    }

}