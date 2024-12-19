package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendNoQueryScenarioTest {

    @Test
    public void appendNoQueryScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

        // when
        urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal("key", "value"));

        // then
        assertEquals("", urlBuilder.build().getQuery());
    }

}