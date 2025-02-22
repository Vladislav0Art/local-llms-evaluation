package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private UrlBuilder urlBuilder;
    private URL url;

    @Before
    public void setUp() throws MalformedURLException {
        url = new URL("http://example.com");
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void build() throws URISyntaxException, UnsupportedEncodingException {
        URL url = urlBuilder.build();

        Assert.assertEquals("http://example.com", url.toString());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void decodePart() {
        String encoded = "%20";

        String decoded = UrlBuilder.decodePart(encoded);

        Assert.assertEquals(" ", decoded);
    }

    @Test
    public void appendToAscii() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii(" ", false, sb);

        Assert.assertEquals("%20", sb.toString());
    }

}