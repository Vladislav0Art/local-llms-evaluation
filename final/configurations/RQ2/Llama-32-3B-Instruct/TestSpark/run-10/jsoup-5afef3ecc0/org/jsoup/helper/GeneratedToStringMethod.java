package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedToStringMethod {

    @org.powermock.modules.junit4.PowerMockRunner
    @org powermock.core.classloader.annotations.PrepareForTest(UrlBuilder .class)

    public void setUp() {
        // No setup needed
    }

    @Test
    public void toStringMethod() {
        String inputUrl = "http://example.com";

        UrlBuilder builder = new UrlBuilder(inputUrl);

        StringBuilder expectedUrl = new StringBuilder(inputUrl);
        expectedUrl.append("?key1=value1");

        assertEquals(expectedUrl.toString(), builder.inputUrl());
    }
}

public class UrlBuilder {

    private String inputUrl;

    public UrlBuilder(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public void appendKeyVal(String key, String value) {
        if (inputUrl.contains("?")) {
            inputUrl += "&" + key + "=" + value;
        } else {
            inputUrl += "?" + key + "=" + value;
        }
    }

    public String inputUrl() {
        return inputUrl;
    }

    @Override
    public String toString() {
        return inputUrl;
    }

    public void build() throws Exception {
        // implement the logic to build the URL
    }

}