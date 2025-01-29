package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDataCollectionTest {

    public static void main(String[] args) {
        HttpConnection.create("http://example.com");
    }

    @Test
    public void dataCollectionTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        assertEquals(data, connection.dataCollection("key1"));
    }

}