package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTest {

    private String inputUrl = "http://example.com";
    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(new URL(inputUrl));
    }

    @Test
    public void build_urlIsCorrectTest() throws MalformedURLException, URISyntaxException {
        URL expectedUrl = new URL("http://example.com/path?query=value");
        assertThat(urlBuilder.build(), is(expectedUrl));
    }

    @Test
    public void appendKeyVal_addsValueToQueryTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        urlBuilder.appendKeyVal(kv);
        String query = URLDecoder.decode(urlBuilder.build().getQuery(), UrlBuilder.UTF_8.toString());
        assertThat(query, is("key=value"));
    }

    @Test
    public void appendKeyVal_addsNewValueToQueryTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv1 = Connection.KeyVal.of("key1", "value1");
        urlBuilder.appendKeyVal(kv1);
        Connection.KeyVal kv2 = Connection.KeyVal.of("key2", "value2");
        urlBuilder.appendKeyVal(kv2);
        String query = URLDecoder.decode(urlBuilder.build().getQuery(), UrlBuilder.UTF_8.toString());
        assertThat(query, is("key1=value1&key2=value2"));
    }

    @Test
    public void appendKeyVal_replacesExistingValueInQueryTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "oldValue");
        urlBuilder.appendKeyVal(kv);
        String query = URLDecoder.decode(urlBuilder.build().getQuery(), UrlBuilder.UTF_8.toString());
        assertThat(query, is("key=oldValue"));
    }

    @Test
    public void appendKeyVal_handlesEmptyQueryTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        urlBuilder.appendKeyVal(kv);
        String query = URLDecoder.decode(urlBuilder.build().getQuery(), UrlBuilder.UTF_8.toString());
        assertThat(query, is(""));
    }

    @Test
    public void appendKeyVal_handlesNullValueTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", null);
        urlBuilder.appendKeyVal(kv);
        String query = URLDecoder.decode(urlBuilder.build().getQuery(), UrlBuilder.UTF_8.toString());
        assertThat(query, is(""));
    }

    @Test
    public void build_urlDecodesPathTest() throws UnsupportedEncodingException {
        String inputPath = "Hello%2CWorld";
        urlBuilder.appendKeyVal(Connection.KeyVal.of("path", inputPath));
        URL expectedUrl = new URL("http://example.com/path?query=value");
        assertThat(urlBuilder.build(), is(expectedUrl));
    }

    @Test
    public void build_urlEncodesQueryTest() throws UnsupportedEncodingException {
        String inputQuery = "Hello%2CWorld";
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", inputQuery));
        URL expectedUrl = new URL("http://example.com/path?query=Hello%2CWorld");
        assertThat(urlBuilder.build(), is(expectedUrl));
    }

    @Test
    public void build_urlEncodesPathAndQueryWhenCombinedTest() throws UnsupportedEncodingException, URISyntaxException {
        String inputPath = "Hello%2CWorld";
        String inputQuery = "Another%20Value";
        urlBuilder.appendKeyVal(Connection.KeyVal.of("path", inputPath));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", inputQuery));
        URL expectedUrl = new URL("http://example.com/path?query=Another+Value");
        assertThat(urlBuilder.build(), is(expectedUrl));
    }

}