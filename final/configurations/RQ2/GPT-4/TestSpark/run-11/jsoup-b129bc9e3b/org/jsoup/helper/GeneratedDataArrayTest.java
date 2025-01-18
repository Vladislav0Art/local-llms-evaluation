package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataArrayTest {

    @Test
    public void dataArrayTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key1", "value1", "key2", "value2");
    }

}