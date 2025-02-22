package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithQueryTest {

    @Mock
    private UrlBuilder urlBuilder;

    @Test
    public void buildWithQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com?q=test");
        URL expectedUrl = new URL("http://example.com?q=test");

        when(urlBuilder.decodePart("example.com")).thenReturn("example.com");

        URL actualUrl = urlBuilder.build(inputUrl);
        assertEquals(expectedUrl, actualUrl);
    }

}