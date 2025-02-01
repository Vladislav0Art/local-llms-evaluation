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
public class GeneratedBuildUrlWithUnicodeCharactersTest {


    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildUrlWithUnicodeCharactersTest() throws Exception {
        URL url = new URL("http://example.com?query=тест");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com?query=%D1%82%D0%B5%D1%81%D1%82");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}