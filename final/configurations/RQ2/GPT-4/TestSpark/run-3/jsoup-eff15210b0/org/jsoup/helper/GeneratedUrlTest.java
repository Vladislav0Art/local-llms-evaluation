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

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws Exception {
        Connection connection = new HttpConnection();
        URL testURL = new URL("http://testurl.com");
        connection.url(testURL);
        assertEquals(testURL, connection.request().url());
    }

}