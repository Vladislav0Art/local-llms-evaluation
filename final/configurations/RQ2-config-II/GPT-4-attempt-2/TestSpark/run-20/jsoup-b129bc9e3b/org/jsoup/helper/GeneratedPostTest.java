package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPostTest {

    @Test
    public void postTest() throws Exception {
        HttpConnection connection = (HttpConnection) new HttpConnection().url(new URL("http://example.com"));
        Document document = connection.post();
        assertNotNull(document);
    }

}