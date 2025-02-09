package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}