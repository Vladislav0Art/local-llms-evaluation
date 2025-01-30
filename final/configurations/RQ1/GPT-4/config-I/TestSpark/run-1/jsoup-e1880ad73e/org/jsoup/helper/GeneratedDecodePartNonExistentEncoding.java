package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartNonExistentEncoding {

    @Test
    public void decodePartNonExistentEncoding() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/%C3%A4%C3%B6%C3%BC");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}