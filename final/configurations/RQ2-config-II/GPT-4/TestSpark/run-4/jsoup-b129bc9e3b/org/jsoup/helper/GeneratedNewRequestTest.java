package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        Assertions.assertNotNull(newConnection);
    }

}