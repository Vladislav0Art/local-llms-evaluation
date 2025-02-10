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

public class GeneratedAppendKeyVal_handlesEmptyQueryTest {

    private String inputUrl = "http://example.com";
    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(new URL(inputUrl));
    }

    @Test
    public void appendKeyVal_handlesEmptyQueryTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        urlBuilder.appendKeyVal(kv);
        String query = URLDecoder.decode(urlBuilder.build().getQuery(), UrlBuilder.UTF_8.toString());
        assertThat(query, is(""));
    }

}