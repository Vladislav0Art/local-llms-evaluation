package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_getters_and_setters]

Test {

    @Test
    public void [UrlBuilder_getters_and_setters]Test() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=Hello World"));
        assertNotNull(builder.getU());
        assertNull(builder.getQ());
    }

}