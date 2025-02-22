package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.runners.JUnit4;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class GeneratedTestBuild {

    @Test
    public void testBuild() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/test/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.example.com/test/path");
        URL actualUrl = builder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}