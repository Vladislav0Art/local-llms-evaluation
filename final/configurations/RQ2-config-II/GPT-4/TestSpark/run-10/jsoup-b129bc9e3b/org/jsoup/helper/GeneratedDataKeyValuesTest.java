package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataKeyValuesTest {

    @Test
    public void dataKeyValuesTest() {
        HttpConnection connection = new HttpConnection();
        connection.data("key1", "value1", "key2", "value2");
        assertEquals(2, connection.request().data().size());
    }

}