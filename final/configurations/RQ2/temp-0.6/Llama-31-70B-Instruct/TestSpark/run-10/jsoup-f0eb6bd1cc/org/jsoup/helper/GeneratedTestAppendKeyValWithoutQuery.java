package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedTestAppendKeyValWithoutQuery {

    @Test
    public void testAppendKeyValWithoutQuery() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/path/to/file#baz");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));

        assertEquals("key=value", urlBuilder.q.toString());
    }

}