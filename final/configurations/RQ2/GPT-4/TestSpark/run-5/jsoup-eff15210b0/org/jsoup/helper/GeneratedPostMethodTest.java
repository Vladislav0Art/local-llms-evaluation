package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedPostMethodTest {

    @Test
    public void postMethodTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        assertNotNull(httpConnection.post());
    }

}