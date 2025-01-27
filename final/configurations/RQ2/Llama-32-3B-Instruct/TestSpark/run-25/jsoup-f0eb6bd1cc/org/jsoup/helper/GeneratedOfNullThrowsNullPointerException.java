package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedOfNullThrowsNullPointerException {

    @Test
    public void ofNullThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}