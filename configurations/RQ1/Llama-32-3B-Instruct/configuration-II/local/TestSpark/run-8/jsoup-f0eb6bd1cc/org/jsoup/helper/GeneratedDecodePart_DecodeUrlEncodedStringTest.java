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

public class GeneratedDecodePart_DecodeUrlEncodedStringTest {

    @Test
    public void decodePart_DecodeUrlEncodedStringTest() {
        String encoded = "Hello%20World!";
        String decoded = UrlBuilder.decodePart(encoded);
        assert decoded.equals("Hello World!");
    }

}