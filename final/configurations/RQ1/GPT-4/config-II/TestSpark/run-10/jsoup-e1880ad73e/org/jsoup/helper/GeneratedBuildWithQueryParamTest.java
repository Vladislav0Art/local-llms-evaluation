package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithQueryParamTest {

    @Test
    public void buildWithQueryParamTest() throws Exception {
        URL inputUrl = new URL("http://www.google.com?k=v");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actual = urlBuilder.build();

        URL expected = new URL("http://www.google.com?k=v");
        assertEquals(expected, actual);
    }

}