package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataCollectionTest {

    @Test
    public void dataCollectionTest() {
        Map<String, String> mapData = new HashMap<>();
        mapData.put("key1", "value1");
        mapData.put("key2", "value2");
        Assert.assertNotNull(new HttpConnection().data(mapData));
    }

}