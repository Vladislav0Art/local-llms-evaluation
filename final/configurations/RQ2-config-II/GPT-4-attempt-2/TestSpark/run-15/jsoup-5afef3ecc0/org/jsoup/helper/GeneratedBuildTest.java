package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        assertNotNull(outputUrl);
    }

}