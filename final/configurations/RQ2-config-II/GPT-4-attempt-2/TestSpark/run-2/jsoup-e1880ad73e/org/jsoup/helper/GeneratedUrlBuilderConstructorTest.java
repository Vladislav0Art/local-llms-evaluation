package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderConstructorTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

}