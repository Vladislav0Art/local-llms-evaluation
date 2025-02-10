package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;

public class GeneratedAppendKeyValEncodesKeyAndValueCorrectly {

    @Test
    public void appendKeyValEncodesKeyAndValueCorrectly() throws UnsupportedEncodingException {
        String key = "test";
        String value = "value";
        Mockito.when(StringUtil.encodeString(key)).thenReturn("test");
        Mockito.when(StringUtil.encodeString(value)).thenReturn("value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(new org.jsoup.internal.StringUtil.KeyVal<>(key, value));
        URL builtUrl = builder.build();
        assertEquals("https://example.com?test=value", builtUrl.toString());
    }

}