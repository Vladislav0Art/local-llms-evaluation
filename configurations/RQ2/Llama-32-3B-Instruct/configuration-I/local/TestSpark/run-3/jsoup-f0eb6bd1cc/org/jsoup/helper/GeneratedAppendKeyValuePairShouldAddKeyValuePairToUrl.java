package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendKeyValuePairShouldAddKeyValuePairToUrl {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void appendKeyValuePairShouldAddKeyValuePairToUrl() {
        // given:
        UrlBuilder urlBuilder = new UrlBuilder();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        urlBuilder.keyVals = data;

        // when
        urlBuilder.appendKeyVal();

        // then
    }

}