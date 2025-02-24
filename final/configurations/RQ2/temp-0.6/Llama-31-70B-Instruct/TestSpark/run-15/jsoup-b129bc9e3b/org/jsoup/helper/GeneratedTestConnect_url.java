package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnect_url {

    @Test
    public void testConnect_url() {
        HttpConnection connection = HttpConnection.connect(new URL("https://www.google.com"));
        assertNotNull(connection);
    }

}