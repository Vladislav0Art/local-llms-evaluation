package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendKeyValuePairShouldThrowExceptionOnInvalidEncoding {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void appendKeyValuePairShouldThrowExceptionOnInvalidEncoding() {
        // given:
        UrlBuilder urlBuilder = new UrlBuilder();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        urlBuilder.keyVals = data;
        Mockito.when(urlBuilder.keyVals).thenReturn(data);
        Mockito.when(urlBuilder.encode()).thenReturn(null);

        // when and then
        org.junit.Assert.assertThat(() -> urlBuilder.appendKeyVal(), org.hamcrest.CoreMatchers.isExceptionThatThrows(UnsupportedEncodingException.class));
    }

}