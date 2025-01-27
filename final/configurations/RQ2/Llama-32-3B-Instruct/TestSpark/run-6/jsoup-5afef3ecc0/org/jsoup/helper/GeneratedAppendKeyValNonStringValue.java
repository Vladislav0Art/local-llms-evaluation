package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValNonStringValue {

    @Test
    public void appendKeyValNonStringValue() {
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv = Connection.KeyVal.of(123L, "value");
        try {
            builder.appendKeyVal(kv);
            assertThat(builder.build().toURI().getQuery(), containsString("123=value"));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

}