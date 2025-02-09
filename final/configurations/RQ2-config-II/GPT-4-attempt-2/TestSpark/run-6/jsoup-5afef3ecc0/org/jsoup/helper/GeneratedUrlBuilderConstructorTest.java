package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull("UrlBuilder instance should be created", builder);
    }

}