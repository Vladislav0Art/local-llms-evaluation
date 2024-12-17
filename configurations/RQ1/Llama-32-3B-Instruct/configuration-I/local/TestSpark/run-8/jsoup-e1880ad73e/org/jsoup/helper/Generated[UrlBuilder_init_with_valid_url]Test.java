package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_init_with_valid_url]

Test {

    @Test
    public void [UrlBuilder_init_with_valid_url]Test() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=Hello World"));
        assertEquals(0, builder.getQ().length(), 1);
    }

}