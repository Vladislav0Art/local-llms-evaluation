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

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection = (HttpConnection) connection.url("https://httpbin.org/post");
        Map<String, String> formData = new HashMap<String, String>();
        formData.put("name", "jsoup");
        connection.data(formData);
        Document document = connection.post();
        Assert.assertTrue(document.text().contains("\"name\": \"jsoup\""));
    }

}