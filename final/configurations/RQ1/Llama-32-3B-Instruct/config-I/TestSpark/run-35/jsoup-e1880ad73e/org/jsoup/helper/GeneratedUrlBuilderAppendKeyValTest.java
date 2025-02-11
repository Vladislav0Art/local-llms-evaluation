package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderAppendKeyValTest {

    @Test
    public void urlBuilderAppendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        String query = builder.q.toString();
        assertEquals("?key=value", query);
    }

}