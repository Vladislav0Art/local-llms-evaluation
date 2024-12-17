package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_build_with_puny_coding]

Test {

    @Test
    public void [UrlBuilder_build_with_puny_coding]Test() throws
    MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=Hello World"));
        String expected = "http%3A%2F%2Fexample.com%2Fpath%3Fquery%3DHello+World";
        assertEquals(expected, builder.getU().toString());
    }

}