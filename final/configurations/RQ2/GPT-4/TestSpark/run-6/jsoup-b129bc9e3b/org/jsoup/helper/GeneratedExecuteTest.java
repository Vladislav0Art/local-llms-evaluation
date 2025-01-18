package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect("http://example.com");
        Connection.Response response = httpConnection.execute();
        assertNotNull(response);
    }

}