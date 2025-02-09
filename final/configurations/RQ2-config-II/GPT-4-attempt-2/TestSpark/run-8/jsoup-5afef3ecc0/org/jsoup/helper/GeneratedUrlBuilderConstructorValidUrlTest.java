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
public class GeneratedUrlBuilderConstructorValidUrlTest {

    @Mock
    private URL url;

    @Test
    public void urlBuilderConstructorValidUrlTest() {
        new UrlBuilder(url);
    }

}