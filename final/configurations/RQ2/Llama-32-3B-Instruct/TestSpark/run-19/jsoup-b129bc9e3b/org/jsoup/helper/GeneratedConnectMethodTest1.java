package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedConnectMethodTest1 {

    @Test
    public void connectMethodTest1() {
        URL url = new URL("http://localhost");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}