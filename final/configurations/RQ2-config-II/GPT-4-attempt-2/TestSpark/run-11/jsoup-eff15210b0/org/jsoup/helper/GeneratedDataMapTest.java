package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDataMapTest {

    @Test
    public void dataMapTest() {
        HttpConnection connection = new HttpConnection();
        HashMap<String, String> aMap = new HashMap<>();
        aMap.put("one", "valueOne");
        aMap.put("two", "valueTwo");
        connection.data(aMap);
        assertEquals("valueOne", connection.data("one"));
        assertEquals("valueTwo", connection.data("two"));
    }

}