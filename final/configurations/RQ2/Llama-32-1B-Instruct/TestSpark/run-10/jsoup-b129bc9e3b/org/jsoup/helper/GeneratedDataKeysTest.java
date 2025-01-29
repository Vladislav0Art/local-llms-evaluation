package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDataKeysTest {

    public static void main(String[] args) {
        HttpConnection.create("http://example.com");
    }

    @Test
    public void dataKeysTest() {
        HttpConnection connection = new HttpConnection();
        List<Connection.KeyVal> keyvals = new ArrayList<>();
        keyvals.add(new Connection.KeyVal("key1", "value1"));
        assertEquals(keyvals, connection.dataCollection("key1"));
    }

}