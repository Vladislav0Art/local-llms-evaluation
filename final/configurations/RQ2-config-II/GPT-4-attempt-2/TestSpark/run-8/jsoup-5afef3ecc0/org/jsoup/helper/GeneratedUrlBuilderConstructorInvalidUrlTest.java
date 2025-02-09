package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderConstructorInvalidUrlTest {

    @Mock
    private URL url;

    @Test
    public void urlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        new UrlBuilder(null);
    }

}