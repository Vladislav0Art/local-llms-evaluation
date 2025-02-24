package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
        when(urlBuilder.appendKeyVal(Mockito.mock(Connection.KeyVal.class))).thenThrow(UnsupportedEncodingException.class);
    }

}