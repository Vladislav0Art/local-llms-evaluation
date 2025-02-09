package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals(200, connection.get().location().status().intValue());
    }

}