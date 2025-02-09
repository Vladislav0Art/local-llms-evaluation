package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDataKeyValTest {

    @Test
    public void dataKeyValTest() {
        String testKey = "key";
        String testVal = "value";
        HttpConnection connection = new HttpConnection();
        connection.data(testKey, testVal);
        assertEquals(testVal, connection.request().data().get(0).value());
    }

}