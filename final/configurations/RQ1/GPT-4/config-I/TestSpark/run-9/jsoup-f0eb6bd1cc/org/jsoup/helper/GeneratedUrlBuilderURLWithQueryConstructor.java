package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderURLWithQueryConstructor {

    @Test
    public void UrlBuilderURLWithQueryConstructor() throws Exception {
        URL inputUrl = new URL("http://www.example.com?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

}