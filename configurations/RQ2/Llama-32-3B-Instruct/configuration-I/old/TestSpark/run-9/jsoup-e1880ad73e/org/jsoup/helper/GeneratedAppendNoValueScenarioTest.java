package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendNoValueScenarioTest {

    @Test
    public void appendNoValueScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        org.jsoup.helper.Connection.KeyVal kv = new org.jsoup.helper.Connection.KeyVal("key", null);

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assertTrue(urlBuilder.build().getQuery().contains("key="));
    }

}