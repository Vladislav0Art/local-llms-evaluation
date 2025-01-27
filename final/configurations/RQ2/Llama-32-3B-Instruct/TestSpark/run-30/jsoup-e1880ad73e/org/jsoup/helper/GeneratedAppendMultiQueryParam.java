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
public class GeneratedAppendMultiQueryParam {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendMultiQueryParam() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
        builder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        assertEquals(new URL("http://example.com?key1=value1&key2=value2"), builder.build());
    }

}