package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlWithStringTest {

    @Test
    public void urlWithStringTest() {
        Connection connection = new HttpConnection().url("http://example.com");
        assertNotNull(connection);
    }

}