package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataWithMapTest {

    @Test
    public void dataWithMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("name", "value");
        Connection connection = new HttpConnection().data(data);
        assertEquals("name=value", connection.request().data().toString());
    }

}