package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;

public class GeneratedAppendKeyVal_withoutKeyValuePairs_doesNotModifyUrl_test {

    @Test
    public void appendKeyVal_withoutKeyValuePairs_doesNotModifyUrl_test() throws UnsupportedEncodingException {
        Connection connection = mock(Connection.class);
        when(connection.getUri()).thenReturn(URI.create("https://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        urlBuilder.appendKeyVal(null);
        assertEquals(new URI("https://example.com"), urlBuilder.build().toURI());
    }

}