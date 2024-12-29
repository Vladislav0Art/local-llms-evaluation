package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValWithNullValueTest {

    @Mock
    private URL inputUrl;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValWithNullValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn(null);
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(kv);
        assertEquals("key", inputUrl.toString());
    }

}