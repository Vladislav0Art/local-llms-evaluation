package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection = (HttpConnection) connection.url("https://www.example.com");
        Assert.assertNotNull(connection.execute());
    }

}