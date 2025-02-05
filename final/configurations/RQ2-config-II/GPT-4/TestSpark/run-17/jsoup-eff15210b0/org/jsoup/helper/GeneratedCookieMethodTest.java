package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookieMethodTest {

    @Test
    public void cookieMethodTest() {
        HttpConnection connection = new HttpConnection();
        Connection result = connection.cookie("key", "value");
        assertNotNull(result);
    }

}