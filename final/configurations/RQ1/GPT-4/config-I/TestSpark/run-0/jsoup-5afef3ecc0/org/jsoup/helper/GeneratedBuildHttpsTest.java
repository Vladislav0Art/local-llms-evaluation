package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildHttpsTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildHttpsTest() throws Exception {
        URL url = new URL("https://127.0.0.1/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("https://127.0.0.1/path?query=value", resultUrl.toString());
    }

}