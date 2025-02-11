package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderAppendKeyValWithNonAsciiValueTest {

    @Test
    public void urlBuilderAppendKeyValWithNonAsciiValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "\u00f6");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        String query = builder.q.toString();
        assertEquals("?key=%3Co", query); // UTF-8 normalization
    }

}