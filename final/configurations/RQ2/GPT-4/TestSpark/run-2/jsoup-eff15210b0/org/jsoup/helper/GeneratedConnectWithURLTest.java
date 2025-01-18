package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectWithURLTest {

    @Test
    public void connectWithURLTest() throws IOException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertEquals("http://example.com", connection.request().url().toString());
    }

}