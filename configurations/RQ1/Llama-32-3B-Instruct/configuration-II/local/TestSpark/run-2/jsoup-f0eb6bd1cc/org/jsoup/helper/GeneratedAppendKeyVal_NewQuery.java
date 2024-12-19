package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.UrlBuilder.UTF_8;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyVal_NewQuery {

    private static UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=param#fragment"));

    @BeforeClass
    public static void setup() {
        String url = "https://example.com/path%20with+space";
        builder.u = new URL(url);
        builder.q = null;
    }

    public static class UrlBuilderTest {

        @Test
        public void appendKeyVal_NewQuery() throws UnsupportedEncodingException {
            KeyVal kv = new KeyVal("new-key", "value");
            builder.appendKeyVal(kv);
            assertEquals("?new-key=value", builder.q.toString());
        }

    }