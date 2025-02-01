package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNonAsciiPathTest {

    @Test
    public void buildWithNonAsciiPathTest() throws Exception {
        URL inputUrl = new URL("http://www.google.com/тест");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actual = urlBuilder.build();

        URL expected = new URL("http://www.google.com/%D1%82%D0%B5%D1%81%D1%82");
        assertEquals(expected, actual);
    }

}