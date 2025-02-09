package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlWithURLTest {

    @Test
    public void urlWithURLTest() throws Exception {
        Connection connection = new HttpConnection().url(new URL("http://example.com"));
        assertNotNull(connection);
    }

}