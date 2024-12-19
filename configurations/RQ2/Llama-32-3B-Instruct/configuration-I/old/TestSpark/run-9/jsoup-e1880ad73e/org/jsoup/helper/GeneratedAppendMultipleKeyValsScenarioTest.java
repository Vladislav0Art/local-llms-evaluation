package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendMultipleKeyValsScenarioTest {

    @Test
    public void appendMultipleKeyValsScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        org.jsoup.helper.Connection.KeyVal kv1 = new org.jsoup.helper.Connection.KeyVal("key1", "value1");
        org.jsoup.helper.Connection.KeyVal kv2 = new org.jsoup.helper.Connection.KeyVal("key2", "value2");

        // when
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        // then
        assertTrue(urlBuilder.build().getQuery().contains("key1=value1&key2=value2"));
    }

}