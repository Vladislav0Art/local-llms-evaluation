package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnect_stringUrl {

    @Test
    public void testConnect_stringUrl() {
        HttpConnection connection = HttpConnection.connect("https://www.google.com");
        assertNotNull(connection);
    }

}