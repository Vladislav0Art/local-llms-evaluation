package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void build_NoQueryTest() {
        URL inputUrl = new URL("http://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/", result.toString());
    }

    @Test
    public void build_QueryTest() {
        URL inputUrl = new URL("http://example.com?query=Hello%20World");
        urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/?query=Hello+World", result.toString());
    }

    @Test
    public void build_RefTest() {
        URL inputUrl = new URL("http://example.com#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/#anchor", result.toString());
    }

    @Test
    public void build_QueryAndRefTest() {
        URL inputUrl = new URL("http://example.com?query=Hello%20World#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/?query=Hello+World#anchor", result.toString());
    }

}