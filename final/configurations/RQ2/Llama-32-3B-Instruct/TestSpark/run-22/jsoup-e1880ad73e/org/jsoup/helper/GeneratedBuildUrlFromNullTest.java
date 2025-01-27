package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlFromNullTest {

    @Test
    public void buildUrlFromNullTest() {
        assertNull(new UrlBuilder(null).build());
    }

}