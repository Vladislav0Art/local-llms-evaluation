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

public class GeneratedAppendKeyVal_addsNewValueToQueryTest {

    private String inputUrl = "http://example.com";
    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(new URL(inputUrl));
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

}