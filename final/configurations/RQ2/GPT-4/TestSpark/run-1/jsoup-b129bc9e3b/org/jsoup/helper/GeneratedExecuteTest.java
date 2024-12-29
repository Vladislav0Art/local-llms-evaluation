package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}