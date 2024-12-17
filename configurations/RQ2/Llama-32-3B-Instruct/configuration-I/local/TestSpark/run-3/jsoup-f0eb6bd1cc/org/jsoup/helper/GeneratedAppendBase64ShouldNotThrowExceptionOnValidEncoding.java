package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendBase64ShouldNotThrowExceptionOnValidEncoding {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void appendBase64ShouldNotThrowExceptionOnValidEncoding() {
        // given:
        UrlBuilder urlBuilder = new UrlBuilder();
        String base64String = "SGVsbG8gd29ybGQh";
        Map<String, String> data = new HashMap<>();
        data.put("key1", Base64.getDecoder().decode(base64String));
        urlBuilder.keyVals = data;
        Mockito.when(urlBuilder.keyVals).thenReturn(data);
        Mockito.when(urlBuilder.encode()).thenReturn(base64String);

        // when and then
        org.junit.Assert.assertThat(() -> urlBuilder.appendBase64(), org.hamcrest.CoreMatchers.isNoException());
    }

}