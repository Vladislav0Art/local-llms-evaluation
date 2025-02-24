package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}