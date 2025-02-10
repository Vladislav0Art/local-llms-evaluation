package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithValidKeyVal {

    @Test
    public void appendKeyValWithValidKeyVal() throws UnsupportedEncodingException {
        Mockito.when(org.jsoup.internal.StringUtil.KeyVal.class.newInstance()).thenReturn(new org.jsoup.helper.DataUtil.KeyValImpl("key", "value"));
        UrlBuilder urlBuilder = new UrlBuilder(null);
        org.jsoup.Connection.KeyVal keyVal = (org.jsoup.Connection.KeyVal) Mockito.mock(org.jsoup.Connection.KeyVal.class);
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", keyVal.toString());
    }

}