package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodePartTestWithInvalidUrl {

    @Test
    public void decodePartTestWithInvalidUrl() {
        String url = "https:/&$%#";
        UrlBuilder.decodePart(url);
    }

}