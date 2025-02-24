package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void buildUrlTest() throws Exception {
        when(inputUrl.toString()).thenReturn("http://www.example.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();

        assertEquals("http://www.example.com", result.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        when(keyVal.getKey()).thenReturn("key");
        when(keyVal.getValue()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVal);

        // assert something here
    }

}