package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestData_Domain {

    @Test
    public void testData_Domain() {
        String key = "test_key";
        assertEquals("http://example.com", HttpConnection.data(key).getHost());
    }

}