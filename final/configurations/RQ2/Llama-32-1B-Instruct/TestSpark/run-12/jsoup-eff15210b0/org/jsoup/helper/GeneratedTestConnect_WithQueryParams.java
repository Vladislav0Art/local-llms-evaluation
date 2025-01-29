package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestConnect_WithQueryParams {

    private HttpConnection connection;
    private URL url;

    @Before
    public void setup() {
        url = new URL("https://example.com");
    }

    @Test
    public void testConnect_WithQueryParams() throws Exception {
        String urlStr = "https://example.com?param1=value1&param2=value2#fragment";
        connection = HttpConnection.connect(new URL(urlStr));
        assertTrue(connection instanceof Connection);
    }

}