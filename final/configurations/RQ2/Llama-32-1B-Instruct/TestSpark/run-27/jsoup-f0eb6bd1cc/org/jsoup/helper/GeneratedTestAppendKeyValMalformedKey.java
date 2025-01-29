package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestAppendKeyValMalformedKey {

    private final UrlBuilder urlBuilder = new UrlBuilder("http://example.com/path?a=1&b=2");

    @Test
    public void testAppendKeyValMalformedKey() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("http://example.com/path");
        builder.appendKeyVal(new UrlKeyValues(null, "value"));
        assertThrows(MalformedURLException.class, () -> urlBuilder.build());
    }

}