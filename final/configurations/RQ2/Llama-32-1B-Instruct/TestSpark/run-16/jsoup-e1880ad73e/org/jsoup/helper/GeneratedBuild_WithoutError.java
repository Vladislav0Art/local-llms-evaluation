package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedBuild_WithoutError {

    public String testUrl = "";

    public void appendKeyVal(String key) {
        this.testUrl += key + "=" + key + "&";
    }

    @Test
    public void build_WithoutError() {
        UrlBuilderAppendKeyVal test = new UrlBuilderAppendKeyVal();
        assertNotThrows(MalformedURLException.class, () -> test.build().toString());
    }

}