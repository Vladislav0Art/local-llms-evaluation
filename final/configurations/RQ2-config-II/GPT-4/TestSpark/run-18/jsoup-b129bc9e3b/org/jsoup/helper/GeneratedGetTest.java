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

public class GeneratedGetTest {

    private static final String TEST_URL = "http://example.com";

    @Test
    public void getTest() throws Exception {
        HttpConnection connection = (HttpConnection) HttpConnection.connect(TEST_URL);
        assertNotNull(connection.get());
    }

}