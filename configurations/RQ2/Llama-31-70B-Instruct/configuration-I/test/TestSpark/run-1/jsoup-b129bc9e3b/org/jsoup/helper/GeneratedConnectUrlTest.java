package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() throws IOException {
        URL url = new URL("http://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}