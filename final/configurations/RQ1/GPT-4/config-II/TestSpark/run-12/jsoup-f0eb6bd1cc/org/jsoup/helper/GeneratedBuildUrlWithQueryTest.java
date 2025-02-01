package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithQueryTest {


    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildUrlWithQueryTest() throws Exception {
        URL url = new URL("http://example.com?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com?query=test");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}