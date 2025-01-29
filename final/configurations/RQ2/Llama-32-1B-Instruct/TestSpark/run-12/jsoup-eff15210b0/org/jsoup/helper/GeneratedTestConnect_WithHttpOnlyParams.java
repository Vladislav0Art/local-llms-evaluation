package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestConnect_WithHttpOnlyParams {

    private HttpConnection connection;
    private URL url;

    @Before
    public void setup() {
        url = new URL("https://example.com");
    }

    @Test
    public void testConnect_WithHttpOnlyParams() throws Exception {
        String params = "param1=value1&param2=value2";
        connection = HttpConnection.connect(url, params);
        assertTrue(params.startsWith("HTTPONLY"));
    }

}