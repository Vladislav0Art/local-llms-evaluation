package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_build_with_escaped_fragment]

Test {

    @Test
    public void [UrlBuilder_build_with_escaped_fragment]Test() throws
    MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path#fragment"));
        String expected = "http%3A%2F%2Fexample.com%2Fpath%23fragment";
        assertEquals(expected, builder.getU().toString());
    }

}