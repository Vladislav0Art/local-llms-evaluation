package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConnectWithUrlTest {

    @Test
    public void connectWithUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        assertNotNull(connection);
    }

}