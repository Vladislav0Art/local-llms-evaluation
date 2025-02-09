package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals(url, result);
    }

}