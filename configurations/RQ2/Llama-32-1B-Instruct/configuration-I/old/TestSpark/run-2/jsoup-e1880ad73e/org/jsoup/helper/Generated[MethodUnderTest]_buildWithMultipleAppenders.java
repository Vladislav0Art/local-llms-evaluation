package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

public class Generated[MethodUnderTest]

_buildWithMultipleAppenders {

    @Test
    public void [MethodUnderTest]_buildWithMultipleAppenders() {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        URL result = urlBuilder.build();
        // Check if all appendKeyVal calls were made
        Assert.assertTrue(result.getQueryParameters().size() == 2);
    }

}