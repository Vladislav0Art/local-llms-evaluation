package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataCollectionTest {

    @Test
    public void dataCollectionTest() {
        HttpConnection connection = new HttpConnection();
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        Collection<Connection.KeyVal> kvs = new ArrayList<>();
        kvs.add(kv);
        assertEquals(kvs, connection.data(kvs).request().data());
    }

}