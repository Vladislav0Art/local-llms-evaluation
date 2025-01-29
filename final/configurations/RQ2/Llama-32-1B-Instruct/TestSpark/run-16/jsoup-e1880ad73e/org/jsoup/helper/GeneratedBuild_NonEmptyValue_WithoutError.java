package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedBuild_NonEmptyValue_WithoutError {

    public String testUrl = "";

    public void appendKeyVal(String key) {
        this.testUrl += key + "=" + key + "&";
    }

    @Test
    public void build_NonEmptyValue_WithoutError() throws MalformedURLException, URISyntaxException {
        String encodedString = "key1=value1";
        UrlBuilderAppendKeyVal test = new UrlBuilderAppendKeyVal(encodedString);
        assertNotThrows(MalformedURLException.class, () -> test.build().toString());
    }

}