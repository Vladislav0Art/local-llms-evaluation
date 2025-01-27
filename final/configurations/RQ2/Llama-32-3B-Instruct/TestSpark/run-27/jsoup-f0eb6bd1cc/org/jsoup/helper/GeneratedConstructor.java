package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedConstructor {

    @Test
    public void constructor() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(builder);
    }

}