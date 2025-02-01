package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedDecodePartThrowRuntimeExceptionWhenUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartThrowRuntimeExceptionWhenUnsupportedEncodingExceptionTest() throws Exception {
        String encoded = URLEncoder.encode("abc", "ISO-8859-1");
        UrlBuilder.decodePart(encoded);
    }

}