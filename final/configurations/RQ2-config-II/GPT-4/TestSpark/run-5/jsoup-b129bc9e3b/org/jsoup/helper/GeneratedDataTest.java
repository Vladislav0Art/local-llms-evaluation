package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("test".getBytes());
        Connection connection = new HttpConnection().data("key", "filename", inputStream, "text/plain");
        assertNotNull(connection);
    }

}