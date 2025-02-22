package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/path/to/page.html?param1=value1&param2=value2#fragment");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("param3", "value3"));
        assertTrue(urlBuilder.q.toString().contains("param3=value3"));
    }

}