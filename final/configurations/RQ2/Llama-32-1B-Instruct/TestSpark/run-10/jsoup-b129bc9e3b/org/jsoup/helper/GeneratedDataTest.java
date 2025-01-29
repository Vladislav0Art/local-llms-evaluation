package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDataTest {

    public static void main(String[] args) {
        HttpConnection.create("http://example.com");
    }

    @Test
    public void dataTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        assertEquals(data, connection.data("key", "value"));
    }

}