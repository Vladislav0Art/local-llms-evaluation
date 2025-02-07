package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestData_Suffixes {

    @Test
    public void testData_Suffixes() {
        String key = "test_key";
        assertTrue(HttpConnection.data(key).stream().anyMatch(k -> k.getKey().equals(key)));
    }

}