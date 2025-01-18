package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

}