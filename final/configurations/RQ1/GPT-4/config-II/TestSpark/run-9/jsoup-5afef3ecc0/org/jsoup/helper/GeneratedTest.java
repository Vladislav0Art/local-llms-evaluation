package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTest {

    @Test
    public void buildReturnOriginalUrlIfExceptionOccurredTest() throws Exception {
        String urlString = "http:::malformed";
        URL url = new URL(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertSame(url, urlBuilder.build());
    }

    @Test
    public void buildWithRefTest() throws Exception {
        String urlString = "http://example.com#ref";
        String normalizedRef = "%20ref%20";
        URL url = new URL(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertTrue(urlBuilder.build().toString().endsWith(normalizedRef));
    }

    @Test
    public void buildWithQueryTest() throws Exception {
        String urlString = "http://example.com?query";
        String normalizedQuery = "+query+";
        URL url = new URL(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertTrue(urlBuilder.build().toString().contains(normalizedQuery));
    }

    @Test
    public void decodePartThrowRuntimeExceptionWhenUnsupportedEncodingExceptionTest() throws Exception {
        String encoded = URLEncoder.encode("abc", "ISO-8859-1");
        UrlBuilder.decodePart(encoded);
    }

    @Test
    public void decodePartSuccessfullyDecodeEncodedPartTest() throws Exception {
        String encoded = URLEncoder.encode("abc", "UTF-8");
        String expected = URLDecoder.decode(encoded, "UTF-8");

        Assert.assertEquals(expected, UrlBuilder.decodePart(encoded));
    }

    @Test
    public void normalizeQueryReplaceSpacesWithPlusSignTest() {
        String q = "query with space";
        String expected = "query+with+space";

        Assert.assertEquals(expected, UrlBuilder.normalizeQuery(q));
    }

    @Test
    public void normalizeRefReplaceSpacesWithHecimal20Test() {
        String r = "ref with space";
        String expected = "ref%20with%20space";

        Assert.assertEquals(expected, UrlBuilder.normalizeRef(r));
    }

    @Test
    public void appendKeyValAppendKeyValTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        String key = "key";
        String value = "value";
        String expected = URLEncoder.encode(key, "UTF-8")
                + "="
                + URLEncoder.encode(value, "UTF-8");

        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));

        Assert.assertEquals(expected, urlBuilder.q.toString());
    }

}