package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildNoQueryNoRefUrlTest {

    @Test
    public void buildNoQueryNoRefUrlTest() throws Exception {
        URL inputUrl = new URL("http://www.google.com/test-path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actual = urlBuilder.build();

        assertEquals(inputUrl, actual);
    }

}