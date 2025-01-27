package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;

public class GeneratedAppendKeyVal_addsKeyValuePairs_test {

    @Test
    public void appendKeyVal_addsKeyValuePairs_test() throws UnsupportedEncodingException {
        Connection connection = mock(Connection.class);
        when(connection.getUri()).thenReturn(URI.create("https://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        HashMap<String, String> keyVal = new HashMap<>();
        keyVal.put("a", "1");
        keyVal.put("b", "2");
        urlBuilder.appendKeyVal(Connection.KeyVal.of(keyVal));
        assertEquals(new URI("https://example.com?a=1&b=2"), urlBuilder.build().toURI());
    }

}