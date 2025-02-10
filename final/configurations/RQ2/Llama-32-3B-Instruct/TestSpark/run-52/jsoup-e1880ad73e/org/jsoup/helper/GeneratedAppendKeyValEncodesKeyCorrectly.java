package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;

public class GeneratedAppendKeyValEncodesKeyCorrectly {

    @Test
    public void appendKeyValEncodesKeyCorrectly() throws UnsupportedEncodingException {
        String key = "test";
        Mockito.when(StringUtil.encodeString(key)).thenReturn("encoded_key");
        UrlBuilder builder = new UrlBuilder();
        KeyVal kv = new KeyVal();
        kv.setKey(key);
        builder.appendKeyVal(kv);
    }

}