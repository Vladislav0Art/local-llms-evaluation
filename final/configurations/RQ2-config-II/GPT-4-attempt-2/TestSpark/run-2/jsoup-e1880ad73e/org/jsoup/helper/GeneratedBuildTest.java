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
public class GeneratedBuildTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals(inputUrl, builtUrl);
    }

}