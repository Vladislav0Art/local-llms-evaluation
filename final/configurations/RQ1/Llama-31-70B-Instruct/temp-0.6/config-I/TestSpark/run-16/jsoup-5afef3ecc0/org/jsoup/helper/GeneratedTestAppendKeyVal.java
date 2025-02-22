package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/path?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("name", "value"));
        assertEquals("name=value", urlBuilder.q.toString());
    }

}