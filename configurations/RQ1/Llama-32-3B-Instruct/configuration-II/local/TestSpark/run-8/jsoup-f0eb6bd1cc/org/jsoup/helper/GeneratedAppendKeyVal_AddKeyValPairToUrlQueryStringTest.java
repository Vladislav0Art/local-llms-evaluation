package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.mockito.Mock;
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

public class GeneratedAppendKeyVal_AddKeyValPairToUrlQueryStringTest {

    @Test
    public void appendKeyVal_AddKeyValPairToUrlQueryStringTest() {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal queryKeyVal[] = new Connection.KeyVal[]{kv};
        builder.appendKeyVal(queryKeyVal);
        // Test expected normalized URL with key-value pair
    }

}