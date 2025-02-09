package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() throws IOException {
        Connection result = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(result);
    }

}