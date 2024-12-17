package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendBase64ShouldAddBase64ToUrl {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void appendBase64ShouldAddBase64ToUrl() {
        // given:
        UrlBuilder urlBuilder = new UrlBuilder();
        String base64String = "SGVsbG8gd29ybGQh";
        Map<String, String> data = new HashMap<>();
        data.put("key1", Base64.getDecoder().decode(base64String));
        urlBuilder.keyVals = data;

        // when
        urlBuilder.appendBase64();

        // then
    }

}