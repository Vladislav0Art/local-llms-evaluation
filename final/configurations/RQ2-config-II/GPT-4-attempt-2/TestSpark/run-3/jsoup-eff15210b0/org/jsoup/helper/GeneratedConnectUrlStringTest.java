package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedConnectUrlStringTest {

    @Test
    public void connectUrlStringTest() {
        Connection result = HttpConnection.connect("http://example.com");
        assertNotNull(result);
    }

}