package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTimeoutVerifyTest {

    @Test
    public void timeoutVerifyTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.timeout(5000);
        Connection.Response response = connection.execute();
        assertEquals(5000, response.timeout());
    }

}