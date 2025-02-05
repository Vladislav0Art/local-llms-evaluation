package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        Response response = new HttpConnection().url("http://example.com").execute();
        assertNotNull(response);
        assertEquals(200, response.statusCode());
    }

}