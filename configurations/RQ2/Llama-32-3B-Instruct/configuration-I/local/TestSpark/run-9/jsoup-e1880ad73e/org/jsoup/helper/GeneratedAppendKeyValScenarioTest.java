package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendKeyValScenarioTest {

    @Test
    public void appendKeyValScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.helper.Connection.KeyVal("key", "value");

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assertTrue(urlBuilder.build().getQuery().contains("key=value"));
    }

}