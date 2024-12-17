package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_init_with_invalid_url]

Test {

    @Test
    public void [UrlBuilder_init_with_invalid_url]Test() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("invalid url"));
        assertNotNull(builder.getU());
        assertNull(builder.getQ());
    }

}