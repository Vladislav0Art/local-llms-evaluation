package org.jsoup.helper;

import org.hamcrest.CoreMatchers;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.*;

public class GeneratedProxyHostPortTest {

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        Connection returnedConn = connection.proxy("127.0.0.1", 8080);
        assertEquals(returnedConn, connection);
    }

}