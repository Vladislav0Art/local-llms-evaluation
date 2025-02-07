package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestData {

    @Test
    public void testData() {
        String key = "test_key";
        assertEquals(0, HttpConnection.data(key).size());
    }

}