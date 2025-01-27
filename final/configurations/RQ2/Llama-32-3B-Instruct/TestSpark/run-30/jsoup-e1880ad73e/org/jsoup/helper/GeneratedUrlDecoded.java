package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlDecoded {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void urlDecoded() throws UnsupportedEncodingException {
        when(kv.getValue()).thenReturn("http%3A%2F%2Fexample.com");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(new URL("http://example.com"), builder.build());
    }

}