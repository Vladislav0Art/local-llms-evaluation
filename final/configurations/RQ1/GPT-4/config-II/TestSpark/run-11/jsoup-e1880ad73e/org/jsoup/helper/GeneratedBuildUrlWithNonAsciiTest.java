package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithNonAsciiTest {

    @Test
    public void buildUrlWithNonAsciiTest() throws Exception {
        URL inputUrl = new URL("http://username:password@exämple.com:8080/päth?qÜery#réf");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://username:password@xn--exmple-4za.com:8080/p%C3%A4th?q%C3%9Cery#r%C3%A9f", resultUrl.toString());
    }

}