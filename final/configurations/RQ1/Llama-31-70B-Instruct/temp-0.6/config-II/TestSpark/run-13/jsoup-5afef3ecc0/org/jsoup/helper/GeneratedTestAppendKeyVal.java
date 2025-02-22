package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        UrlBuilder.KeyVal keyVal = Mockito.mock(UrlBuilder.KeyVal.class);
        when(urlBuilder.appendKeyVal(keyVal)).thenReturn(urlBuilder);
        assertEquals(urlBuilder, urlBuilder.appendKeyVal(keyVal));
    }

}