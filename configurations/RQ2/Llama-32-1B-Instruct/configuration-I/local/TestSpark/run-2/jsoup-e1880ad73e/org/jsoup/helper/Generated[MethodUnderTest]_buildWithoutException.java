package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

public class Generated[MethodUnderTest]

_buildWithoutException {

    @Test
    public void [MethodUnderTest]_buildWithoutException() {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        // Check if the method returns a valid URL
        Assert.assertEquals("http://example.com", result.toString());
    }

}