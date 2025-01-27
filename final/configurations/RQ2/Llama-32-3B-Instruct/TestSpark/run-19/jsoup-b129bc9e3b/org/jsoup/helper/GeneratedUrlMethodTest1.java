package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedUrlMethodTest1 {

    @Test
    public void urlMethodTest1() {
        URL url = new URL("http://localhost");
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
    }

}