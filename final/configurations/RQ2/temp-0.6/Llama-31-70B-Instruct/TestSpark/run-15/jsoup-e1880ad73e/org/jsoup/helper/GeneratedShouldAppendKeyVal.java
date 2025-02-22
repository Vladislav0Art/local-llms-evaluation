package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedShouldAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(mock(URL.class));
    }

    @Test
    public void shouldAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        // TODO: assert the expected behavior
    }

}