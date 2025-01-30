package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection.KeyVal;

public class GeneratedBuildUrlWithNonAsciiCharactersTest {

    @Test
    public void buildUrlWithNonAsciiCharactersTest() throws Exception {
        URL url = new URL("http://www.google.com/search?q=школа");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://www.google.com/search?q=%D1%88%D0%BA%D0%BE%D0%BB%D0%B0", result.toString());
    }

}