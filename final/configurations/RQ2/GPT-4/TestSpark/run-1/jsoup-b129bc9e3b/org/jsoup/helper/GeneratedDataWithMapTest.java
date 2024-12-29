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

public class GeneratedDataWithMapTest {

    @Test
    public void dataWithMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("name", "value");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data(data);
    }

}