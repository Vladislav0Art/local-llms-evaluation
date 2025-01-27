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
public class GeneratedAppendKeyVal {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(new URL("http://example.com?key=value"), builder.build());
    }

}