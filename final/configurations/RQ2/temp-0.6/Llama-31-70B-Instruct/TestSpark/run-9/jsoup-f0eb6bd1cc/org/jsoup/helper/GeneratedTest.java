package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = mock(URL.class);
        urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotNull(outputUrl);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = mock(URL.class);
        urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(kv);
        verify(kv, times(1)).key();
        verify(kv, times(1)).value();
    }

}