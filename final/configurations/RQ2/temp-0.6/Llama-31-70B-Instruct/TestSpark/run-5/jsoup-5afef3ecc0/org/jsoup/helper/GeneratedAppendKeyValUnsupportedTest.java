package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedTest {

    @Test
    public void appendKeyValUnsupportedTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        UrlBuilder urlBuilder = Mockito.mock(UrlBuilder.class);
        urlBuilder.appendKeyVal(keyVal);
    }

}