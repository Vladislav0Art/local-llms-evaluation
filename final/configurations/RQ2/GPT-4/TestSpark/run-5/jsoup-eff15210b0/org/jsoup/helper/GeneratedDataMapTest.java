package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        int dataSize = httpConnection.data(map).request().data().size();
        assertEquals(2, dataSize);
    }

}