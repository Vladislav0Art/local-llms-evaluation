package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderTest {

    @Test
    public void UrlBuilderTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");

        assertNotNull(new UrlBuilder(inputUrl));
    }

}