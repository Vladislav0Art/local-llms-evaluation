package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

public class Generated[MethodUnderTest]

_buildWithoutAppenders {

    @Test
    public void [MethodUnderTest]_buildWithoutAppenders() {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        // Check if the method is called with at least one key-value pair
        Assert.assertTrue(result.getQueryParameters().size() > 0);
    }

}