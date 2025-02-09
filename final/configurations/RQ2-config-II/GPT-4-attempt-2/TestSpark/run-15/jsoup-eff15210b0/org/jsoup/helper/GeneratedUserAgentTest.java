package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        String testUserAgent = "Mozilla/5.0";
        HttpConnection connection = new HttpConnection();
        connection.userAgent(testUserAgent);
        assertEquals(testUserAgent, connection.request().userAgent());
    }

}