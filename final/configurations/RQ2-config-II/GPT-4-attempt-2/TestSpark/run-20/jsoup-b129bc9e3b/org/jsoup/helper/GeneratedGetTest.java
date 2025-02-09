package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() throws Exception {
        HttpConnection connection = (HttpConnection) new HttpConnection().url(new URL("http://example.com"));
        Document document = connection.get();
        assertNotNull(document);
    }

}