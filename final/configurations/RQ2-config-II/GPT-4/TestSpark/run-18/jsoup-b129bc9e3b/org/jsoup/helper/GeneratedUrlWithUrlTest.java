package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.jsoup.Connection.Method;
import org.junit.Test;
import org.mockito.Matchers;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

public class GeneratedUrlWithUrlTest {

    private static final String TEST_URL = "http://example.com";

    @Test
    public void urlWithUrlTest() throws Exception {
        URL url = new URL(TEST_URL);
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.url(url));
    }

}