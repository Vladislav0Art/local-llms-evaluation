package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestHeader {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testHeader() throws IOException, URISyntaxException {
        String name = "test_header";
        String value = "test_value";
        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(new URL("https://example.com"), null);
        assertEquals(200, connection.getResponseCode());
        assertEquals(name, connection.getHeaderField(name));
    }

}