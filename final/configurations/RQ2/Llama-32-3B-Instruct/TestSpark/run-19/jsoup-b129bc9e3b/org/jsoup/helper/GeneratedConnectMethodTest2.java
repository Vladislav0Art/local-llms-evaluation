package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedConnectMethodTest2 {

    @Test
    public void connectMethodTest2() {
        URL url = new URL("http://localhost:8080");
        Connection connection = HttpConnection.connect(new URL("http://localhost:8080"));
        assertNotNull(connection);
    }

}