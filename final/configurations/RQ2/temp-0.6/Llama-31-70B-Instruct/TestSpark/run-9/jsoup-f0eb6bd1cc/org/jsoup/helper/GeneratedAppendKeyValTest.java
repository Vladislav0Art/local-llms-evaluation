package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

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