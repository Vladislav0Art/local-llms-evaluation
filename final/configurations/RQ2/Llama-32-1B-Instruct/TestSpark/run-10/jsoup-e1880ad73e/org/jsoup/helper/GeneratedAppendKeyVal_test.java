package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_test {

    @Test
    public void appendKeyVal_test() {
        String key = "test_key";
        String value = "test_value";

        Mockito.mock(Connection.class);
        UrlBuilder urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
        org.jsoup.KeyVal kv = new org.jsoup.KeyVal(key, value);
        urlBuilder.appendKeyVal(kv);
        Mockito.verify(urlBuilder).appendKeyVal(Mockito.any(org.jsoup.KeyVal.class));
    }

}