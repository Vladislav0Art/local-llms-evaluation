package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.userAgent("Mozilla/5.0"));
    }

}