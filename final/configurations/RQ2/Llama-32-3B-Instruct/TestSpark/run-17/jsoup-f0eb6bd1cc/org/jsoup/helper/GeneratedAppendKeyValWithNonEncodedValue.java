package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValWithNonEncodedValue {

    @Test
    public void appendKeyValWithNonEncodedValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        String nonEncodedValue = "string";
        when(kv.getString()).thenReturn(nonEncodedValue);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        verify(kv).setString(nonEncodedValue);
    }

}