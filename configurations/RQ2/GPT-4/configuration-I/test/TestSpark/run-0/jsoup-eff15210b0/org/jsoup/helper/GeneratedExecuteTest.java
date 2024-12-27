package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.execute());
    }

}