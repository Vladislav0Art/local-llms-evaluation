package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedResponseUnsupportedMimeTypeTest {

    @Test
    public void responseUnsupportedMimeTypeTest() throws IOException {
        String url = "http://example.com";
        Connection connection = Jsoup.connect(url);
        connection.ignoreContentType(true);
        connection.execute();
    }

}