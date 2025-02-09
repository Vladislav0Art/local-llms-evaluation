package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws IOException {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.url(new URL("http://example.com"));
        assertNotNull(result);
    }

}