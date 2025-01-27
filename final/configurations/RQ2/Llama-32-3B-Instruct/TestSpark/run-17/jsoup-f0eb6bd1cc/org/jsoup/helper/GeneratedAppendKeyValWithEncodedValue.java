package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValWithEncodedValue {

    @Test
    public void appendKeyValWithEncodedValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        String encodedValue = URLEncoder.encode("string", DataUtil.UTF_8.name());
        when(kv.getString()).thenReturn(encodedValue);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        verify(kv).setString(encodedValue);
    }

}