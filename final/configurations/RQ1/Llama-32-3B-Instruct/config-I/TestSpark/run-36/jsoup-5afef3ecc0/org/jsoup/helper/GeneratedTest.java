package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructionWithQueryAndRef

    TestUrlBuilderConstructionWithQueryAndRef() throws UnsupportedEncodingException {
        URL u = new URL("http://a%20b.com?c=d&e=f#h");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertNotNull(urlBuilder.u);
        assertEquals(9, urlBuilder.q.toString().length());
    }

    @Test
    public void urlBuilderConstructionWithQueryAndNoRef

    TestUrlBuilderConstructionWithQueryAndNoRef() throws UnsupportedEncodingException {
        URL u = new URL("http://a%20b.com?c=d&e=f");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertNotNull(urlBuilder.u);
        assertNull(urlBuilder.q);
    }

    @Test
    public void urlBuilderConstructionWithNoQueryAndRef

    TestUrlBuilderConstructionWithNoQueryAndRef() throws UnsupportedEncodingException {
        URL u = new URL("http://a%20b.com");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertNotNull(urlBuilder.u);
        assertNull(urlBuilder.q);
    }

    @Test
    public void appendKeyValWithSingleKeyValue

    TestUrlBuilderAppendKeyValWithSingleKeyValue() throws UnsupportedEncodingException {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://a%20b.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(2, urlBuilder.q.toString().length());
    }

    @Test
    public void appendKeyValWithMultipleKeyValue

    TestUrlBuilderAppendKeyValWithMultipleKeyValue() throws UnsupportedEncodingException {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key1", "value1");
        kv.put("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://a%20b.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(9, urlBuilder.q.toString().length());
    }

    @Test
    public void buildWithPunyCodingAndNonAsciiPath

    TestUrlBuilderBuildWithPunyCodingAndNonAsciiPath() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://a%20b.com/path%200utf8?c=d&e=f");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        URI uri = new URI(
                urlBuilder.u.getProtocol(),
                urlBuilder.u.getUserInfo(),
                IDN.toASCII(decodePart(urlBuilder.u.getHost())),
                urlBuilder.u.getPort(),
                decodePart(urlBuilder.u.getPath()),
                null, null
        );
        assertEquals("http://a%20b.com/path0utf8?c=d&e=f", uri.getScheme() + "://" + uri.getHost() + uri.getPath());
    }

    @Test
    public void buildWithQueryAndRef

    TestUrlBuilderBuildWithQueryAndRef() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://a%20b.com?c=d&e=f#h");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        URI uri = new URI(
                urlBuilder.u.getProtocol(),
                urlBuilder.u.getUserInfo(),
                IDN.toASCII(decodePart(urlBuilder.u.getHost())),
                urlBuilder.u.getPort(),
                decodePart(urlBuilder.u.getPath()),
                null, null
        );
        assertEquals("http://a%20b.com?c=d&e=f#h", uri.getScheme() + "://" + uri.getHost() + uri.getPath());
    }

    @Test
    public void buildWithInvalidUrl

    TestUrlBuilderBuildWithInvalidUrl() throws MalformedURLException, URISyntaxException {
        new UrlBuilder(new URL("http://a%20b.com"));
    }

}