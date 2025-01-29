package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestData {

    @Test
    public void testData() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        String[] data = {"key1", "value1"};
        connection.setData(data);
        assertEquals("key1=value1", connection.data("key1"));
    }

}