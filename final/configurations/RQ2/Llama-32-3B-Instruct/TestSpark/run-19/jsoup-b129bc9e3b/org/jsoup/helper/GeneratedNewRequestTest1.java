package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedNewRequestTest1 {

    @Test
    public void newRequestTest1() {
        Connection connection = HttpConnection.connect(new URL("http://localhost"));
        Connection request = connection.newRequest();
        assertTrue(request instanceof Request);
    }

}